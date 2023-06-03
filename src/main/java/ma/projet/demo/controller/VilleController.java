package ma.projet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.demo.entities.Restaurant;
import ma.projet.demo.entities.Ville;
import ma.projet.demo.entities.Zone;
import ma.projet.demo.service.VilleService;

@RestController
@CrossOrigin
@RequestMapping("villes")
public class VilleController {
	@Autowired
	private VilleService villeService;
	@PostMapping("/save")
    public void save(@RequestBody Ville ville){
		villeService.save(ville);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id){
        Ville v = villeService.findById(Integer.parseInt(id));
        villeService.delete(v);
    }
    @GetMapping("/all")
    public List<Ville> findAll(){
        return villeService.findAll();
    }
    @GetMapping("/{id}")
    public Ville findById(@PathVariable int id)
    {
    	return villeService.findById(id);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Ville ville) {
    	 villeService.update(ville);
    }
    @GetMapping("/ville/{nom}")
    public Ville findByNom(@PathVariable String nom)
    {
    	return villeService.findByNom(nom);
    }
    @GetMapping("/{nom}/zones")
    public  List<Zone> findZonesByVille(@PathVariable String nom){
    	
    	return villeService.findZonesByVille(nom);
    }
    @GetMapping("/{nomV}/zones/{nomZ}/restaurants")
    public List<Restaurant> findRestoByZone(@PathVariable String nomV,@PathVariable String nomZ){
    	return villeService.findRestoByZone(nomV, nomZ);
    }

	
}

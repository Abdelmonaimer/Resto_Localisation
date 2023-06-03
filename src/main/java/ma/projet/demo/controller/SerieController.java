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
import ma.projet.demo.entities.Serie;
import ma.projet.demo.entities.Ville;
import ma.projet.demo.service.SerieService;

@RestController
@CrossOrigin
@RequestMapping("series")
public class SerieController {
	@Autowired
	SerieService serieService;
	@PostMapping("/save")
    public void save(@RequestBody Serie serie){
		serieService.save(serie);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id){
    	Serie s = serieService.findById(Integer.parseInt(id));
    	serieService.delete(s);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Serie serie) {
    	serieService.update(serie);
    }
    @GetMapping("/all")
    public List<Serie> findAll(){
        return serieService.findAll();
    }
    @GetMapping("/{id}")
    public Serie findSerieById(@PathVariable int id){
        return serieService.findById(id);
    }
}

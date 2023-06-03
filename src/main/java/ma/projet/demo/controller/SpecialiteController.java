package ma.projet.demo.controller;

import java.util.List;
import java.util.Set;

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

import ma.projet.demo.entities.Serie;
import ma.projet.demo.entities.Specialite;

import ma.projet.demo.service.SpecialiteService;

@RestController
@CrossOrigin
@RequestMapping("specialites")
public class SpecialiteController {
	
	@Autowired
	private SpecialiteService specialiteService;
	
	@PostMapping("/save")
    public void save(@RequestBody Specialite specialite){
		specialiteService.save(specialite);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id){
    	Specialite s = specialiteService.findById(Integer.parseInt(id));
    	specialiteService.delete(s);
    }
    @GetMapping("/all")
    public List<Specialite> findAll(){
        return specialiteService.findAll();
    }
    @GetMapping("/{id}")
    public Specialite findSpecialiteById(@PathVariable int id){
        return specialiteService.findById(id);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Specialite specialite) {
    	specialiteService.update(specialite);
    }

}

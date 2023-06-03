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


import ma.projet.demo.entities.Zone;
import ma.projet.demo.service.ZoneService;

@RestController
@CrossOrigin
@RequestMapping("zones")
public class ZoneController {
	@Autowired
	private ZoneService zoneService;
	@PostMapping("/save")
    public void save(@RequestBody Zone zone){
		zoneService.save(zone);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id){
    	Zone s = zoneService.findById(Integer.parseInt(id));
    	zoneService.delete(s);
    }
    @GetMapping("/all")
    public List<Zone> findAll(){
        return zoneService.findAll();
    }
    @GetMapping("/{id}")
    public Zone findSpecialiteById(@PathVariable int id){
        return zoneService.findById(id);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Zone zone) {
    	zoneService.update(zone);
    }

}

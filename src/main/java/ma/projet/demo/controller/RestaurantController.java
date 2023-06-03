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

import ma.projet.demo.entities.Restaurant;
import ma.projet.demo.entities.Serie;
import ma.projet.demo.entities.Specialite;
import ma.projet.demo.service.RestaurantService;


@RestController
@CrossOrigin
@RequestMapping("restaurants")
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping("/save")
    public void save(@RequestBody Restaurant restaurant){
		restaurantService.save(restaurant);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id){
    	Restaurant r = restaurantService.findById(Integer.parseInt(id));
        restaurantService.delete(r);
    }
    @GetMapping("/all")
    public List<Restaurant> findAll(){
        return restaurantService.findAll();
    }
    @GetMapping("/{nomV}/zones/{nomZ}/restaurants/specialite/{nomS}")
    public List<Restaurant> filterRestoByspeciality(@PathVariable String nomV,@PathVariable String nomZ,@PathVariable String nomS){
    	return restaurantService.filterRestoByspeciality(nomV, nomZ, nomS);
    }
    @GetMapping("/{nomV}/zones/{nomZ}/restaurants/serie/{nomSerie}")
    public List<Restaurant> filterRestoBySerie(@PathVariable String nomV,@PathVariable String nomZ,@PathVariable String nomSerie){
    	return restaurantService.filterRestoBySerie(nomV, nomZ, nomSerie);
    }
    @GetMapping("/{id}")
    public Restaurant findRestaurantById(@PathVariable int id){
        return restaurantService.findById(id);
    }
    @GetMapping("/{idR}/specialite")
    public Set<Specialite> findspecialityByResto(@PathVariable int idR){
    	return restaurantService.findspecialityByResto(idR);
    }
    @GetMapping("/{idR}/serie")
    public Serie findSerieByResto(@PathVariable int idR){
    	return restaurantService.findSerieByResto(idR);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Restaurant restaurant) {
    	restaurantService.update(restaurant);
    }
}

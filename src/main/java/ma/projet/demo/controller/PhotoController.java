package ma.projet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.projet.demo.entities.Photo;
import ma.projet.demo.service.PhotoService;

@RestController
@CrossOrigin
@RequestMapping("photos")
public class PhotoController {
	@Autowired
	private PhotoService photoService;
	
	@PostMapping("/save")
    public void save(@RequestBody Photo photo){
		photoService.save(photo);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable (required = true) String id){
    	Photo p = photoService.findById(Integer.parseInt(id));
    	photoService.delete(p);
    }
    @GetMapping("/all")
    public List<Photo> findAll(){
        return photoService.findAll();
    }
    @GetMapping("/{id}")
    public Photo findRestaurantById(@PathVariable int id){
        return photoService.findById(id);
    }
    
    @GetMapping("/resto/{idR}/photos")
    public List<Photo> findPhotoByResto (@PathVariable int idR){
    	return photoService.findPhotoByResto(idR);
    }
}

package ma.projet.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.demo.dao.IDao;
import ma.projet.demo.entities.Photo;
import ma.projet.demo.entities.Restaurant;
import ma.projet.demo.repository.PhotoRepository;

@Service
public class PhotoService implements IDao<Photo> {

	
	@Autowired
	PhotoRepository photoRepository;
	@Autowired
	RestaurantService restaurantService;
	@Override
	public Photo save(Photo o) {
		// TODO Auto-generated method stub
		return photoRepository.save(o);
	}

	@Override
	public List<Photo> findAll() {
		// TODO Auto-generated method stub
		return photoRepository.findAll();
	}

	@Override
	public Photo findById(int id) {
		// TODO Auto-generated method stub
		return photoRepository.findById(id);
	}

	@Override
	public void update(Photo o) {
		// TODO Auto-generated method stub
		photoRepository.save(o);
	}

	@Override
	public void delete(Photo o) {
		// TODO Auto-generated method stub
		photoRepository.delete(o);
	}
	
	public List<Photo> findPhotoByResto (int idR){
		Restaurant r = restaurantService.findById(idR);
		return r.getPhoto();	}

}

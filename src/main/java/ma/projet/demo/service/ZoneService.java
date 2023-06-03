package ma.projet.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.demo.dao.IDao;
import ma.projet.demo.entities.Zone;
import ma.projet.demo.repository.ZoneRepository;
@Service
public class ZoneService implements IDao<Zone>{
	@Autowired
	ZoneRepository zoneRepository;
	@Override
	public Zone save(Zone o) {
		// TODO Auto-generated method stub
		return zoneRepository.save(o);
	}

	@Override
	public List<Zone> findAll() {
		// TODO Auto-generated method stub
		return zoneRepository.findAll();
	}

	@Override
	public Zone findById(int id) {
		// TODO Auto-generated method stub
		return zoneRepository.findById(id);
	}

	@Override
	public void update(Zone o) {
		// TODO Auto-generated method stub
		zoneRepository.save(o);
		
	}

	@Override
	public void delete(Zone o) {
		// TODO Auto-generated method stub
		zoneRepository.delete(o);
	}
	
	public Zone findByNom(String nom) {
		return zoneRepository.findByNom(nom);
	}
	

}

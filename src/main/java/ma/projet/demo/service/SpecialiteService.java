package ma.projet.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.demo.dao.IDao;
import ma.projet.demo.entities.Specialite;
import ma.projet.demo.repository.SpecialiteRepository;
@Service
public class SpecialiteService implements IDao<Specialite>{
	@Autowired
	SpecialiteRepository specialiteRepository;
	

	@Override
	public Specialite save(Specialite o) {
		// TODO Auto-generated method stub
		return specialiteRepository.save(o);
	}

	@Override
	public List<Specialite> findAll() {
		// TODO Auto-generated method stub
		return specialiteRepository.findAll();
	}

	@Override
	public Specialite findById(int id) {
		// TODO Auto-generated method stub
		return specialiteRepository.findById(id);
	}

	@Override
	public void update(Specialite o) {
		// TODO Auto-generated method stub
		specialiteRepository.save(o);
	}

	@Override
	public void delete(Specialite o) {
		// TODO Auto-generated method stub
		specialiteRepository.delete(o);
	}
	public Specialite findByNom(String nom) {
		return specialiteRepository.findByNom(nom);
	}
	
	

}

package ma.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.demo.entities.Specialite;
@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer>{
	Specialite findById(int id);
	Specialite findByNom(String nom);
}

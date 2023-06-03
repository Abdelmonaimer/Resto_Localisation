package ma.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.demo.entities.Serie;
@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {
	Serie findById(int id);
	Serie findByNom(String nomSerie);

}

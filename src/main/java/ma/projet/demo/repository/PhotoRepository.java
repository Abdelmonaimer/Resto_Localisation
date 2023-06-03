package ma.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.demo.entities.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer>{
	Photo findById(int id);
}

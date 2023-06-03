package ma.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.demo.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findById(int id);
}

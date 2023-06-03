package ma.projet.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.demo.entities.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
	Restaurant findById(int id);

}

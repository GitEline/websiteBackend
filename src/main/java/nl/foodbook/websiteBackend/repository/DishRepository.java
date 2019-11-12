package nl.foodbook.websiteBackend.repository;

import nl.foodbook.websiteBackend.domain.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends CrudRepository<Dish, Long> {
}

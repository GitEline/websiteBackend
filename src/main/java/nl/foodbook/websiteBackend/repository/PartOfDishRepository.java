package nl.foodbook.websiteBackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import nl.foodbook.websiteBackend.domain.PartOfDish;

@Repository
public interface PartOfDishRepository extends CrudRepository<PartOfDish, Long> {



}

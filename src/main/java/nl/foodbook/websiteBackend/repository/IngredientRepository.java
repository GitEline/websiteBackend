package nl.foodbook.websiteBackend.repository;

import nl.foodbook.websiteBackend.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
    Iterable<Ingredient> findByNameIngredient(String nameIngredient);
}

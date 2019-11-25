package nl.foodbook.websiteBackend.repository;

import nl.foodbook.websiteBackend.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Iterable<Recipe> findByRecipeTitle(String recipeTitle);
    Iterable<Recipe> findByRecipeTitleLike(String recipeTitle);

}

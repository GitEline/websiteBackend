package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Recipe;
import nl.foodbook.websiteBackend.repository.PartOfDishRepository;
import nl.foodbook.websiteBackend.repository.RecipeRepository;
import nl.foodbook.websiteBackend.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecipeService {

    @Autowired
    private final RecipeRepository recipeRepository;

    @Autowired
    private final PartOfDishRepository partOfDishRepository;

    @Autowired
    private final IngredientRepository ingredientRepository;

    public RecipeService(RecipeRepository recipeRepository, PartOfDishRepository partOfDishRepository, IngredientRepository ingredientRepository) {
        this.recipeRepository = recipeRepository;
        this.partOfDishRepository = partOfDishRepository;
        this.ingredientRepository = ingredientRepository;
    }


    public Iterable<Recipe> findAllRecipes(){
        return recipeRepository.findAll();
    }

    public Recipe addRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }


}

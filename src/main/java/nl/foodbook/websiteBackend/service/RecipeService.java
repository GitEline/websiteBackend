package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Recipe;
import nl.foodbook.websiteBackend.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecipeService {

    @Autowired
    private final RecipeRepository recipeRepository;


    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    public Iterable<Recipe> findAllRecipes(){
        return recipeRepository.findAll();
    }

    public Recipe addRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }


}

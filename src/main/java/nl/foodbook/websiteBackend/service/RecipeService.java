package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Recipe;
import nl.foodbook.websiteBackend.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


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

    public Optional<Recipe> findByRecipeId(Long recipeId){
        return recipeRepository.findById(recipeId);
    }

    public Iterable<Recipe> findByRecipeTitle(String recipeTitle){
        return recipeRepository.findByRecipeTitle(recipeTitle);
    }

    public Iterable<Recipe> findByRecipeTitleLike(String recipeTitle){
        return recipeRepository.findByRecipeTitleLike(recipeTitle);
    }


    public Recipe addRecipe(Recipe recipe){
        Recipe recipetest = recipeRepository.save(recipe);
        System.out.println(recipetest.getRecipeId() + recipetest.getRecipeTitle());
        return recipetest;
    }


}

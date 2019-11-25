package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.Recipe;
import nl.foodbook.websiteBackend.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping("/recipe")
    public List<Recipe> getRecipes(){
        return (List<Recipe>) recipeService.findAllRecipes();
    }

    @PostMapping("/recipe")
    void addRecipe(@RequestBody Recipe recipe) {
        recipeService.addRecipe(recipe);
    }




}

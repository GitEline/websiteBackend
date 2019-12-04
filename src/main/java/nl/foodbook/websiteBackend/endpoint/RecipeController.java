package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.Recipe;
import nl.foodbook.websiteBackend.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
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

    @GetMapping(path = "/recipe/{recipeId}")
    public Optional<Recipe> findRecipeById(@PathVariable Long recipeId) {
        return recipeService.findByRecipeId(recipeId);
    }

    @GetMapping(path = "/recipe/recipetitle/{recipeTitle}")
    public Iterable<Recipe> findByRecipeTitle(@PathVariable String recipeTitle){
        return recipeService.findByRecipeTitle(recipeTitle);
    }

    @GetMapping(path = "/recipe/recipetitlelike/{recipeTitle}")
    public Iterable<Recipe> findByRecipeTitleLike(@PathVariable String recipeTitle){
        return recipeService.findByRecipeTitleLike(recipeTitle);
    }

    @PostMapping("/recipe")
    Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }




}

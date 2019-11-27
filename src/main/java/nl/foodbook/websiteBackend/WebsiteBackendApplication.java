package nl.foodbook.websiteBackend;

import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.domain.PartOfDish;
import nl.foodbook.websiteBackend.domain.Recipe;
import nl.foodbook.websiteBackend.domain.Unit;
import nl.foodbook.websiteBackend.service.PartOfDishService;
import nl.foodbook.websiteBackend.service.RecipeService;
import nl.foodbook.websiteBackend.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebsiteBackendApplication implements ApplicationRunner {

    @Autowired
    IngredientService ingredientService;
    @Autowired
    RecipeService recipeService;
    @Autowired
    PartOfDishService partOfDishService;


    public static void main(String[] args) {
        SpringApplication.run(WebsiteBackendApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Recipe recipe = insertRecipe("wortel pepernoten stamppot");
        String[] ingredientTags = {"gluten"};
        Ingredient ingredient = insertIngredient("wortel", ingredientTags);
        PartOfDish partOfDish = insertPartOfDish(ingredient, recipe, Unit.G, 500.0);
        ingredient = insertIngredient("pepernoten", ingredientTags);
        insertPartOfDish(ingredient, recipe, Unit.G, 600.0);

    }
    

            public Recipe insertRecipe(String recipeName){
            Recipe recipe = new Recipe(recipeName);
            return recipeService.addRecipe(recipe);
            }

            public Ingredient insertIngredient(String ingredientName, String[] tags){
            Ingredient ingredient = new Ingredient(ingredientName, tags);
            return ingredientService.addIngredient(ingredient);
            }

            public PartOfDish insertPartOfDish(Ingredient ingredient, Recipe recipe, Unit unit, Double quantity){
            PartOfDish partOfDish = new PartOfDish(ingredient, recipe, unit, quantity);
            return partOfDishService.addPartOfDish(partOfDish);
            }


}

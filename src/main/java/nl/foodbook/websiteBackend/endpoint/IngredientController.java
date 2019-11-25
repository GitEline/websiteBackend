package nl.foodbook.websiteBackend.endpoint;


import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredient")
    public List<Ingredient> getIngredients(){
        return (List<Ingredient>) ingredientService.findAllIngredients();
    }

    @PostMapping("/ingredient")
    public void addIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.addIngredient(ingredient);
    }


}

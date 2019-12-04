package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
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

    @GetMapping(path = "/ingredient/{ingredientId}")
    public Optional<Ingredient> findIngredientById(@PathVariable Long ingredientId) {
        return ingredientService.findByIngredientId(ingredientId);
    }


    @GetMapping(path = "/ingredient/nameingredient/{nameIngredient}")
    public Iterable<Ingredient> findByIngredientName(@PathVariable String nameIngredient){
        return ingredientService.findByNameIngredient(nameIngredient);
    }


        @PostMapping("/ingredient")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.addIngredient(ingredient);
    }


}

package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.PartOfDish;
import nl.foodbook.websiteBackend.service.PartOfDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PartOfDishController {

    @Autowired
    private final PartOfDishService partOfDishService;

    public PartOfDishController(PartOfDishService partOfDishService) {
        this.partOfDishService = partOfDishService;
    }

    @GetMapping("/partofdish/{recipeId}")
    public Iterable<PartOfDish> findByRecipe(@PathVariable Long recipeId){
        return partOfDishService.findByRecipeRecipeId(recipeId);
    }

    @GetMapping("/partofdish")
    public List<PartOfDish> getPartOfDishes(){
        return (List<PartOfDish>) partOfDishService.findAllPartOfDish();
    }

    @GetMapping("/partofdish/tags/{tags}")
    public java.util.stream.Stream<PartOfDish> findByRecipeIngredientTags(@PathVariable String[] tags){
        return partOfDishService.findByRecipeIngredientTags(tags);
    }


    @PostMapping("/partofdish")
    PartOfDish addPartOfDish(@RequestBody PartOfDish partOfDish) {
        return partOfDishService.addPartOfDish(partOfDish);
    }


}

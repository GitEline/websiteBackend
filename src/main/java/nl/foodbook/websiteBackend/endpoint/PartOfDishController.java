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

    @GetMapping("/partofdish/recipe/{recipeId}")
    public Iterable<PartOfDish> findByRecipe(@PathVariable Long recipeId){return partOfDishService.findByRecipeRecipeId(recipeId);
    }

    @GetMapping("/partofdish")
    public List<PartOfDish> getPartOfDishes(){
        return (List<PartOfDish>) partOfDishService.findAllPartOfDish();
    }

    @PostMapping("/partofdish")
    void addPartOfDish(@RequestBody PartOfDish partOfDish) {
        partOfDishService.addPartOfDish(partOfDish);
    }


}

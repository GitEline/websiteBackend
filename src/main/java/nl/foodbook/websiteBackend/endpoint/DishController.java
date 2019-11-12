package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.Dish;
import nl.foodbook.websiteBackend.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DishController {

    @Autowired
    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }


    @GetMapping("/dish")
    public List<Dish> getDishes(){
        return (List<Dish>) dishService.findAll();
    }

    @PostMapping("/dish")
    void addDish(@RequestBody Dish dish) {
        dishService.addDish(dish);
    }




}

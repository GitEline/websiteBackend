package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.PartOfDish;
import nl.foodbook.websiteBackend.service.PartOfDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartOfDishController {

    @Autowired
    private final PartOfDishService partOfDishService;

    public PartOfDishController(PartOfDishService partOfDishService) {
        this.partOfDishService = partOfDishService;
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

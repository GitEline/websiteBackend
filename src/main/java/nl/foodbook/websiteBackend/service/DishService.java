package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Component;
import nl.foodbook.websiteBackend.domain.Dish;
import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.domain.Unit;
import nl.foodbook.websiteBackend.repository.ComponentRepository;
import nl.foodbook.websiteBackend.repository.DishRepository;
import nl.foodbook.websiteBackend.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DishService {

    @Autowired
    private final DishRepository dishRepository;

    @Autowired
    private final ComponentRepository componentRepository;

    @Autowired
    private final IngredientRepository ingredientRepository;

    public DishService(DishRepository dishRepository, ComponentRepository componentRepository, IngredientRepository ingredientRepository) {
        this.dishRepository = dishRepository;
        this.componentRepository = componentRepository;
        this.ingredientRepository = ingredientRepository;
    }


    public Iterable<Dish> findAllDishes(){
        return dishRepository.findAll();
    }

    public void addDish(Dish dish){
        dishRepository.save(dish);
        List<Component> testComponentList = dish.getAllComponents();
        for(Component component : testComponentList) {
            System.out.println(component);
            componentRepository.save(component);
            ingredientRepository.save(component.getIngredient());
        }
    }








    @Autowired
    IngredientService ingredientService;
    @Autowired
    ComponentService componentService;


//    @PostConstruct
//    void initAutoDatabase(){
//
//
//    Ingredient wortel = new Ingredient ("wortel");
//    ingredientService.addIngredient(wortel);
//    ingredientService.addIngredient(new Ingredient("pepernoten"));
//    ingredientService.addIngredient(new Ingredient("witlof"));
//    ingredientService.addIngredient(new Ingredient("peper"));
//    ingredientService.addIngredient(new Ingredient("zout"));
//    ingredientService.addIngredient(new Ingredient("aardappelen"));
//    ingredientService.addIngredient(new Ingredient("ui"));
//
//
//    Component wortelComponent = new Component(wortel, Unit.G, 500);
//    List<Component> componentenWortelPepernotenStampot = new ArrayList<>();
//    componentenWortelPepernotenStampot.add();
//
//
//
//
//
//
//}







}

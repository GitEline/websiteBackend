package nl.foodbook.websiteBackend;

import nl.foodbook.websiteBackend.domain.Component;
import nl.foodbook.websiteBackend.domain.Dish;
import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.domain.Unit;
import nl.foodbook.websiteBackend.repository.DishRepository;
import nl.foodbook.websiteBackend.service.DishService;
import nl.foodbook.websiteBackend.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@SpringBootApplication
public class WebsiteBackendApplication {

    @Autowired
    IngredientService ingredient;
    @Autowired
    DishService dishService;


    public static void main(String[] args) {
        SpringApplication.run(WebsiteBackendApplication.class, args);
    }



    @Bean
    CommandLineRunner init(DishRepository dishRepository) {





        List<Component> listIngredient = new ArrayList<>();
        Ingredient testIngredient = new Ingredient("banaan");
        Component testComponent = new Component(testIngredient, Unit.CLOVES, 5.0);
        listIngredient.add(testComponent);

        Dish testDish = new Dish();
        testDish.setAllComponents(listIngredient);


//        Dish testDish = new Dish("banaan stampot", listIngredient, "test stappen2");
//        dishService.addDish(testDish);

        StringBuilder sb = new StringBuilder("bla");
        String s = "blob";


        ingredient.addIngredient(new Ingredient("wortel"));

        return args -> {
            Stream.of("Appeltaart", "Stamppotje wortel en pepernoten", "Sinaasappel").forEach(dishTitle -> {
                Dish dish = new Dish(dishTitle, listIngredient, s);
                dishRepository.save(dish);
            });
            dishRepository.findAll().forEach(System.out::println);
        };

    }

}

package nl.foodbook.websiteBackend;

import nl.foodbook.websiteBackend.domain.Dish;
import nl.foodbook.websiteBackend.domain.DishIngredient;
import nl.foodbook.websiteBackend.repository.DishRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;

@SpringBootApplication
public class WebsiteBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteBackendApplication.class, args);
    }


    @Bean
    CommandLineRunner init(DishRepository dishRepository) {

        List<DishIngredient> listIngredient = new ArrayList<>();
        StringBuilder sb = new StringBuilder("bla");

        return args -> {
            Stream.of("Appeltaart", "Stamppotje wortel en pepernoten", "Sinaasappel").forEach(dishTitle -> {
                Dish dish = new Dish(dishTitle, "appel", sb);
                dishRepository.save(dish);
            });
            dishRepository.findAll().forEach(System.out::println);
        };

    }
}

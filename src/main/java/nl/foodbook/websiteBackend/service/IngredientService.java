package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.repository.IngredientRepository;
import nl.foodbook.websiteBackend.repository.PartOfDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

    @Autowired
    private final IngredientRepository ingredientRepository;


    public IngredientService(IngredientRepository ingredientRepository, PartOfDishRepository partOfDishRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    public Iterable<Ingredient> findAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient addIngredient(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }



}

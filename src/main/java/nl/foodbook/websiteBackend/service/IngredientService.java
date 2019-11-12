package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Ingredient;
import nl.foodbook.websiteBackend.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

    @Autowired
    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    public Iterable<Ingredient> findAllIngredients() {
        return ingredientRepository.findAll();
    }





}

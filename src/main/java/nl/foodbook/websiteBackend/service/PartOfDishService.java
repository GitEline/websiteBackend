package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.PartOfDish;
import nl.foodbook.websiteBackend.repository.PartOfDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartOfDishService {

    @Autowired
    private final PartOfDishRepository partOfDishRepository;

    public PartOfDishService(PartOfDishRepository partOfDishRepository) {
        this.partOfDishRepository = partOfDishRepository;
    }


    public Iterable<PartOfDish> findAllPartOfDish(){
        return partOfDishRepository.findAll();
    }

    public Iterable<PartOfDish> findByRecipeRecipeId(Long recipeId){
        return partOfDishRepository.findByRecipeRecipeId(recipeId);
    }



    public PartOfDish addPartOfDish(PartOfDish partOfDish){
        return partOfDishRepository.save(partOfDish);
    }


}

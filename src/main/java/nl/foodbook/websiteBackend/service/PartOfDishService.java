package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.PartOfDish;
import nl.foodbook.websiteBackend.repository.PartOfDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

//public Iterable<PartOfDish> findByRecipeIngredientTags(String[] tags){
//        Iterable<PartOfDish> partOfDishWoTags = findAllPartOfDish();
//        List<PartOfDish> listPartOfDishWoTags = new ArrayList<PartOfDish>();
//        for(PartOfDish pod : partOfDishWoTags){
//            listPartOfDishWoTags.add(pod);
//        }
//
//        for(String tag : tags){
//                Predicate<PartOfDish> streamsPredicate = x -> {
//                        if(x.getIngredient().getTags().contains(tag)){
//                           listPartOfDishWoTags.stream().filter(x -> x).forEach();
//                        }
//                }
//        }
//
//        return partOfDishRepository.findByRecipeIngredientTags(tags);
//}

    public PartOfDish addPartOfDish(PartOfDish partOfDish){
        return partOfDishRepository.save(partOfDish);
    }


}

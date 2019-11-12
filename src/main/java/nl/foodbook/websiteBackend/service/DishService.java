package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Dish;
import nl.foodbook.websiteBackend.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService {

    @Autowired
    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }


    public Iterable<Dish> findAll(){
        return dishRepository.findAll();
    }

    public void addDish(Dish dish){
        dishRepository.save(dish);
    }



}

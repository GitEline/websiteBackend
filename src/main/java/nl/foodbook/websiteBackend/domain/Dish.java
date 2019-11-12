package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dishId;
    private String dishTitle;
    @OneToMany//(mappedBy = "dish")
    private Set<DishIngredient> ingredients;
    private StringBuilder stappen;



    public long getDishId() {
        return dishId;
    }
    public String getDishTitle() {
        return dishTitle;
    }
    public void setDishTitle(String dishTitle) {
        this.dishTitle = dishTitle;
    }
    public Set<DishIngredient> getIngredients() {
        return ingredients;
    }
    public void setIngredientList(Set<DishIngredient> ingredients) {
        this.ingredients = ingredients;
    }
    public StringBuilder getStappen() {
        return stappen;
    }
    public void setStappen(StringBuilder stappen) {
        this.stappen = stappen;
    }


    public Dish(String dishTitle, String appel, StringBuilder sb) {
    }
    public Dish(){

    }
    public Dish(String dishTitle, Set<DishIngredient> ingredients, StringBuilder stappen) {
        this();
        this.dishTitle = dishTitle;
        this.ingredients = ingredients;
        this.stappen = stappen;
    }



}

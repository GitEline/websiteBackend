package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ingredientId;
    private String nameIngredient;


    public long getIngredientId(){return ingredientId;}
    public String getNameIngredient() {
        return nameIngredient;
    }
    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }


    public Ingredient() {
    }
    public Ingredient(String nameIngredient) {
        this();
        this.nameIngredient = nameIngredient;
    }




}

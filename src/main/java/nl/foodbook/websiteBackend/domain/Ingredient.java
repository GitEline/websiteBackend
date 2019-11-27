package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ingredientId;
    private String nameIngredient;
    private String[] tags;


    public Long getIngredientId(){return ingredientId;}
    public String getNameIngredient() {
        return nameIngredient;
    }
    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }
    public String[] getTags() {
        return tags;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Ingredient() {
    }
    public Ingredient(String nameIngredient, String[] tags) {
        this();
        this.nameIngredient = nameIngredient;
        this.tags = tags;
    }




}

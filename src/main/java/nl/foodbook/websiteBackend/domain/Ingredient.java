package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ingredientId;
    private String nameIngredient;



    public String getNameIngedrient() {
        return nameIngredient;
    }
    public void setNameIngedrient(String nameIngedrient) {
        this.nameIngredient = nameIngredient;
    }



    public Ingredient() {
    }
    public Ingredient(String nameIngredient) {
        this();
        this.nameIngredient = nameIngredient;
    }




}

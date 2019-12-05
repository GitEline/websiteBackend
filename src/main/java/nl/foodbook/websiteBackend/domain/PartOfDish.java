package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class PartOfDish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long partOfDishId;
    @OneToOne
    private Ingredient ingredient;
    private String unit;
    private double quantity;
    @ManyToOne
    private Recipe recipe;


    public Long getPartOfDishId() {
        return partOfDishId;
    }
    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) { this.unit = unit;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


    public PartOfDish() {
    }

    public PartOfDish(Ingredient ingredient, Recipe recipe, String unit, double quantity) {
        this();
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.unit = unit;
        this.quantity = quantity;
    }


    public boolean checkTags(PartOfDish pod, String[] tags){
        boolean containstag = false;
        List<String> tagsToFilter = Arrays.asList(tags);
        List<String> tagsOfIngredient = new ArrayList<>();
        String[] tagsInIngredient = pod.ingredient.getTags();
        for (String tagsIngredient: tagsInIngredient) {
            tagsOfIngredient.add(tagsIngredient);
        }

        for(String tag : tagsToFilter){
            if (tagsOfIngredient.contains(tag)){
                containstag = true;
                break;
            }
        }
        return containstag;
    }

}

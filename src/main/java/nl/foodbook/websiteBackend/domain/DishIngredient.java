package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class DishIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dishIngredientId;
    @OneToOne
    private Ingredient ingredient;
    private Unit unit;
    private double quantity;
    private String ingredientQuantity;

    @ManyToOne
    Dish dish;


    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    public Unit getUnit() {
        return unit;
    }
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public String getIngredientQuantity() {
        return ingredientQuantity;
    }


    public DishIngredient() {
    }

    public DishIngredient(Ingredient ingredient, Unit unit, double quantity) {
        this();
        this.ingredient = ingredient;
        this.unit = unit;
        this.quantity = quantity;
        this.ingredientQuantity = quantity + unit.toString() + ingredient;
    }


}

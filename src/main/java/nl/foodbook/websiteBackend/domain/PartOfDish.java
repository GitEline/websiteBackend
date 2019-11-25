package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class PartOfDish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long partOfDishId;
    @OneToOne
    private Ingredient ingredient;
    private Unit unit;
    private double quantity;
    @ManyToOne
    private Recipe recipe;


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



    public PartOfDish() {
    }

    public PartOfDish(Ingredient ingredient, Recipe recipe, Unit unit, double quantity) {
        this();
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.unit = unit;
        this.quantity = quantity;
    }


}

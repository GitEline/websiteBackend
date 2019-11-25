package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

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
    public void setUnit(Unit unit) {
        this.unit = unit.getValue();
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
        this.unit = unit.getValue();
        this.quantity = quantity;
    }


}

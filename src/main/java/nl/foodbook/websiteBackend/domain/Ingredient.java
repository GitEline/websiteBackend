package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ingredientId;
    private String nameIngredient;
//    private List<String> tag;
    @OneToOne(mappedBy = "ingredient")
    DishIngredient dishIngredient;


    public String getNameIngedrient() {
        return nameIngredient;
    }

    public void setNameIngedrient(String nameIngedrient) {
        this.nameIngredient = nameIngredient;
    }
//    public List<String> getTag() {
//        return tag;
//    }

//
//    public void setTag(List<String> tag) {
//        this.tag = tag;
//    }


    public Ingredient() {
    }

    public Ingredient(String nameIngredient, List<String> tag) {
        this();
        this.nameIngredient = nameIngredient;
//        this.tag = tag;
    }




}

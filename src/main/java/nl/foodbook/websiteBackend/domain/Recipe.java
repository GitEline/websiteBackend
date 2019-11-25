package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recipeId;
    private String recipeTitle;


    public Long getRecipeId() {
        return recipeId;
    }
    public String getRecipeTitle() {
        return recipeTitle;
    }
    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }


    public Recipe(){
    }
    public Recipe(String recipeTitle) {
        this();
        this.recipeTitle = recipeTitle;
    }


}

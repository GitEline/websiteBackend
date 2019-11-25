package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long recipeId;
    private String recipeTitle;


    public long getRecipeId() {
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

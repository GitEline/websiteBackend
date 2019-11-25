package nl.foodbook.websiteBackend.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dishId;
    private String dishTitle;
//    @OneToMany//(mappedBy = "dish")
//    private List<Component> allComponents;
    private String/*Builder*/ stappen;



    public long getDishId() {
        return dishId;
    }
    public String getDishTitle() {
        return dishTitle;
    }
    public void setDishTitle(String dishTitle) {
        this.dishTitle = dishTitle;
    }
//    public List<Component> getAllComponents() {
//        return allComponents;
//    }
//    public void setAllComponents(List<Component> allComponents) {
//        this.allComponents = allComponents;
//    }
    public String/*Builder*/ getStappen() {
        return stappen;
    }
    public void setStappen(String/*Builder*/ stappen) {
        this.stappen = stappen;
    }



    public Dish(){

    }
    public Dish(String dishTitle, List<Component> ingredients/*, String/*Builder/ stappen*/) {
        this();
        this.dishTitle = dishTitle;
//        this.allComponents = allComponents;
        this.stappen = stappen;
    }



}

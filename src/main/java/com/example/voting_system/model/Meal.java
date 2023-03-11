package com.example.voting_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "meal", uniqueConstraints = {@UniqueConstraint(columnNames = "name" , name = "meal_unique_name_ids")})
public class Meal extends AbstractBaseEntity{

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @Column(name="ingredients", nullable = false)
    @NotBlank
    private String ingredients;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @NotNull
    private Restaurant restaurant;

    public Meal(Integer id, String name, String ingredients, Restaurant restaurant) {
        super(id);
        this.name = name;
        this.ingredients = ingredients;
        this.restaurant = restaurant;
    }

    public Meal(String name, String ingredients, Restaurant restaurant){
        this(null, name,  ingredients, restaurant);
    }

    public Meal(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", restaurant=" + restaurant +
                ", id=" + id +
                '}';
    }
}

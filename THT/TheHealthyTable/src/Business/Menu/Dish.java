/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import Business.Ingredient.Ingredient;
import Business.Ingredient.IngredientDirectory;
import Business.User.Restaurant;

/**
 *
 * @author Alex
 */
public class Dish {

    private static int count = 1;
    private int dishId;
    private String name;
    private float price;
    private String imagePath;
    private IngredientDirectory ingredientDirectory;
    private boolean isActive = false;
    private Restaurant restaurant;

    public boolean isIsActive() {
        return isActive;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Dish() {
        this.dishId = count++;
        this.ingredientDirectory = new IngredientDirectory();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDishId() {
        return dishId;
    }

    public IngredientDirectory getIngredientDirectory() {
        return ingredientDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public float getCalorieBalance() {
        float calorie = 0;
        for (Ingredient i : this.ingredientDirectory.getIngredientList()) {
            calorie += i.calculateCalorie();
        }
        return calorie;
    }

    public enum DishType {

        I("I"),
        II("II"),
        III("III"),
        IV("IV");

        private String value;

        private DishType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    @Override
    public String toString() {
        return String.valueOf(dishId);
    }

}

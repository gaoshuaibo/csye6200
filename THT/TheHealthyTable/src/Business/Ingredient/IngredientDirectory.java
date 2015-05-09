/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ingredient;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class IngredientDirectory {

    private ArrayList<Ingredient> ingredientList;

    public IngredientDirectory() {
        ingredientList = new ArrayList<Ingredient>();
    }

    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public Ingredient addIngredient() {
        Ingredient newIngredient = new Ingredient();
        this.ingredientList.add(newIngredient);
        return newIngredient;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredientList.add(ingredient);
    }

    public boolean haveIngredientType(Ingredient.IngredientType type) {
        for (Ingredient ingredient : ingredientList) {
            if (ingredient.getIngredientType().equals(type)) {
                return true;
            }
        }
        return false;
    }
}

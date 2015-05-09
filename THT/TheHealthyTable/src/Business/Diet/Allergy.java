/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diet;

import Business.Ingredient.Ingredient;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Allergy {
    private ArrayList<Ingredient.IngredientType> ingredientTypeList;

    public Allergy() {
        ingredientTypeList = new ArrayList<Ingredient.IngredientType>();
    }

    public ArrayList<Ingredient.IngredientType> getIngredientTypeList() {
        return ingredientTypeList;
    }

    public void setIngredientTypeList(ArrayList<Ingredient.IngredientType> ingredientTypeList) {
        this.ingredientTypeList = ingredientTypeList;
    }
}

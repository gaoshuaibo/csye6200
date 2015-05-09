/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diet;

import Business.Common.CalorieTable;
import Business.Ingredient.Ingredient;
import Business.Menu.Dish;
import Business.Organization.RestaurantOrganization;
import Business.User.Customer;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class DietGenerater {

    private Customer customer;
    private RestaurantOrganization restaurantOrganization;
    private ArrayList<Dish> dishListTotal;

    public DietGenerater(Customer customer, RestaurantOrganization restaurantOrganization) {
        this.customer = customer;
        this.restaurantOrganization = restaurantOrganization;
        this.dishListTotal = restaurantOrganization.getAllDish();
    }

    public Diet generateDiet() {
        Diet diet = new Diet();
        ArrayList<Dish> filteredDishList = locationFilter(dishListTotal);
        filteredDishList = allergyFilter(filteredDishList);
        filteredDishList = eatingHabbitFilter(filteredDishList);
        filteredDishList = calorieFilter(filteredDishList, CalorieTable.getCalorieMin(customer.getSurvey().getTrent()), CalorieTable.getCalorieMax(customer.getSurvey().getTrent()));
        diet.setDishList(filteredDishList);
        return diet;
    }

    private ArrayList<Dish> locationFilter(ArrayList<Dish> dishList) {
        ArrayList<Dish> filteredDishList = new ArrayList<Dish>();
        for (Dish dish : dishList) {
            if (dish.getRestaurant().getLocationArea().equals(customer.getLocationArea())) {
                filteredDishList.add(dish);
            }
        }
        return filteredDishList;
    }

    private ArrayList<Dish> allergyFilter(ArrayList<Dish> dishList) {
        ArrayList<Dish> filteredDishList = new ArrayList<Dish>();
        boolean canEat = true;
        for (Dish dish : dishList) {
            for (Ingredient.IngredientType type : customer.getSurvey().getAllergy().getIngredientTypeList()) {
                if (dish.getIngredientDirectory().haveIngredientType(type)) {
                    canEat = false;
                    break;
                }
            }
            if (canEat) {
                filteredDishList.add(dish);
            }
        }
        return dishList;
    }

    private ArrayList<Dish> eatingHabbitFilter(ArrayList<Dish> dishList) {
        ArrayList<Dish> filteredDishList = new ArrayList<Dish>();
        boolean wantEat = false;
        for (Dish dish : dishList) {
            for (Ingredient.IngredientType type : customer.getSurvey().getEatingHabbit().getIngredientTypeList()) {
                if (dish.getIngredientDirectory().haveIngredientType(type)) {
                    wantEat = true;
                    break;
                }
            }
            if (wantEat) {
                filteredDishList.add(dish);
            }
        }
        return filteredDishList;
    }

    private ArrayList<Dish> calorieFilter(ArrayList<Dish> dishList, float minCalorie, float maxCalorie) {
        ArrayList<Dish> filteredDishList = new ArrayList<Dish>();
        float calorieTotal = 0;

        while (!(calorieTotal >= minCalorie && calorieTotal <= maxCalorie)) {
            if (calorieTotal < minCalorie) {
                for (Dish dish : dishList) {
                    if (!filteredDishList.contains(dish)) {
                        filteredDishList.add(dish);
                        calorieTotal += dish.getCalorieBalance();
                        break;
                    }
                }
            }
            if (calorieTotal > maxCalorie) {
                Dish minusDish = getTheLeastCalorieDish(filteredDishList);
                filteredDishList.remove(minusDish);
                calorieTotal -= minusDish.getCalorieBalance();
            }
        }
        return filteredDishList;
    }

    private Dish getTheMostCalorieDish(ArrayList<Dish> dishList) {
        if (dishList.size() == 0) {
            return null;
        }
        Dish mostCalorieDish = dishList.get(0);
        for (Dish dish : dishList) {
            if (dish.getCalorieBalance() > mostCalorieDish.getCalorieBalance()) {
                mostCalorieDish = dish;
            }
        }
        return mostCalorieDish;
    }

    private Dish getTheLeastCalorieDish(ArrayList<Dish> dishList) {
        if (dishList.size() == 0) {
            return null;
        }
        Dish leastCalorieDish = dishList.get(0);
        for (Dish dish : dishList) {
            if (dish.getCalorieBalance() < leastCalorieDish.getCalorieBalance()) {
                leastCalorieDish = dish;
            }
        }
        return leastCalorieDish;
    }
}

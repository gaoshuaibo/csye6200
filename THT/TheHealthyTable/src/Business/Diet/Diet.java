/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diet;

import Business.Menu.Dish;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Diet {

    private ArrayList<Dish> dishList;

    public Diet() {
        this.dishList = new ActivatableArrayList<Dish>();
    }

    public ArrayList<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }

    public void addDish(Dish dish) {
        this.dishList.add(dish);
    }

    public float getCalorieTotal() {
        float calorie = 0;
        for (Dish dish : dishList) {
            calorie += dish.getCalorieBalance();
        }
        return calorie;
    }

    public Dish getTheMostCalorieDish() {
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

    public Dish getTheLeastCalorieDish() {
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

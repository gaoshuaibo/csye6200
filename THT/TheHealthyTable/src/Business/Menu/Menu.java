/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Menu {

    private static int count = 1;
    private int menuId;
    private String name;
    private ArrayList<Dish> dishList;

    public Menu() {
        this.menuId = count++;
        dishList = new ArrayList<Dish>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMenuId() {
        return menuId;
    }

    public ArrayList<Dish> getDishList() {
        return dishList;
    }

    public Dish addDish() {
        Dish newDish = new Dish();
        this.dishList.add(newDish);
        return newDish;
    }

}

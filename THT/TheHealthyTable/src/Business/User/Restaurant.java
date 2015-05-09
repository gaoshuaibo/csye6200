/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Finance.RestaurantFinance;
import Business.Location.LocationArea;
import Business.Menu.Menu;
import Business.Order.OrderDirectory;

/**
 *
 * @author Alex
 */
public class Restaurant extends User {

    private static int count = 1;
    private int restaurantId;
    private float incomingPercentage = 0;
    private Menu menu;
    private OrderDirectory orderDirectory;
    private RestaurantFinance restaurantFinance;

    public Restaurant() {
        this.restaurantId = count++;
        orderDirectory = new OrderDirectory();
        menu = new Menu();
        restaurantFinance = new RestaurantFinance();
    }

    public RestaurantFinance getRestaurantFinance() {
        return restaurantFinance;
    }

    public float getIncomingPercentage() {
        return incomingPercentage;
    }

    public void setIncomingPercentage(float incomingPercentage) {
        this.incomingPercentage = incomingPercentage;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Menu getMenu() {
        return menu;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.User.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class OrderDirectory {

    private ArrayList<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public Order addOrder(Restaurant restaurant) {
        Order newOrder = new Order();
        newOrder.setRestaurant(restaurant);
        restaurant.getOrderDirectory().getOrderList().add(newOrder);
        this.orderList.add(newOrder);
        return newOrder;
    }

//    public float getTotalIncome() {
//        float income = 0;
//        for (Order o : this.orderList) {
//            income += o.getIncome();
//        }
//        return income;
//    }

}

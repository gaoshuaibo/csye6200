/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cart;

import Business.Menu.Dish;
import Business.Menu.Menu;
import Business.User.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class CartItem {
    
    private static int count = 1;
    private int cartItemId;
    private Restaurant restaurant;
    private ArrayList<CartItemUnit> dishList;
    
    public CartItem() {
        cartItemId = count++;
        dishList = new ArrayList<CartItemUnit>();
    }
    
    public int getCartItemId() {
        return cartItemId;
    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }
    
    public ArrayList<CartItemUnit> getDishList() {
        return dishList;
    }
    
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    public CartItemUnit searchCartItemUnit(Dish dish) {
        for (CartItemUnit ciu : dishList) {
            if (ciu.getDish().equals(dish)) {
                return ciu;
            }
        }
        return null;
    }
    
    public CartItemUnit addCartItemUnit(Dish dish, int quantity) {
        CartItemUnit ciu = searchCartItemUnit(dish);
        if (ciu == null) {
            CartItemUnit newCartItemUnit = new CartItemUnit();
            newCartItemUnit.setDish(dish);
            newCartItemUnit.setQuantity(quantity);
            this.dishList.add(newCartItemUnit);
            return newCartItemUnit;
        } else {
            ciu.setQuantity(ciu.getQuantity() + quantity);
            return ciu;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.cartItemId);
    }
}

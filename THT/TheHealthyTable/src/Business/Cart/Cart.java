/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cart;

import Business.User.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Cart {

    private ArrayList<CartItem> cartItemList;

    public Cart() {
        cartItemList = new ArrayList<CartItem>();
    }

    public ArrayList<CartItem> getCartItemList() {
        return cartItemList;
    }

    public CartItem searchCartItem(Restaurant restaurant) {
        for (CartItem ci : cartItemList) {
            if (ci.getRestaurant().equals(restaurant)) {
                return ci;
            }
        }
        return null;
    }

    public CartItem addCartIteam(Restaurant restaurant) {
        CartItem ci = searchCartItem(restaurant);
        if (ci == null) {
            CartItem newCartItem = new CartItem();
            newCartItem.setRestaurant(restaurant);
            this.cartItemList.add(newCartItem);
            return newCartItem;
        } else {
            return ci;
        }
    }
}

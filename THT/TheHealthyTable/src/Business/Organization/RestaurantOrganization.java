/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Menu.Dish;
import Business.Role.RestaurantRole;
import Business.Role.Role;
import Business.User.Restaurant;
import Business.UserAccount.UserAccount;
import UserInterface.DishesContainerJPanel;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class RestaurantOrganization extends Organization {

    public RestaurantOrganization() {
        super(Organization.TypeofOrg.Restaurant);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new RestaurantRole());
        return roles;
    }

    public ArrayList<Restaurant> getAllRestaurant() {
        ArrayList<Restaurant> list = new ArrayList<Restaurant>();
        for (UserAccount ua : super.getUserAccountDirectory().getUserAccountList()) {
            list.add((Restaurant) ua.getUser());
        }
        return list;
    }

    public ArrayList<Dish> getAllDish() {
        ArrayList<Dish> dishList = new ActivatableArrayList<Dish>();
        for (Restaurant restaurant : getAllRestaurant()) {
            for (Dish dish : restaurant.getMenu().getDishList()) {
                dishList.add(dish);
            }
        }
        return dishList;
    }
}

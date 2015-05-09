/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Cart.Cart;
import Business.Diet.Allergy;
import Business.Diet.Diet;
import Business.Diet.EatingHabbit;
import Business.Order.OrderDirectory;
import Business.Survey.Survey;

/**
 *
 * @author Alex
 */
public class Customer extends User {

    private Diet diet;
    private Cart cart;
    private OrderDirectory orderDirectory;
    private Survey survey;

    public Customer() {
        cart = new Cart();
        diet = new Diet();
        orderDirectory = new OrderDirectory();
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Cart getCart() {
        return cart;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Business;
import Business.Ingredient.Ingredient;
import static Business.Organization.Organization.TypeofOrg.Customer;
import Business.Payment.Payment;
import Business.Ticket.Ticket;
import Business.Ticket.TicketGenerater;
import Business.User.Customer;
import Business.User.Restaurant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Order {

    private static int count = 1;
    private int orderId;
    private Restaurant restaurant;
    private ArrayList<OrderItem> orderItemList;
    private Customer customer;
    private Payment payment;
    private Date timeStamp;
    private Ticket ticket;
    private boolean isConsumed = false;
    private Date consumeTimeStamp;

    public Order() {
        orderId = count++;
        timeStamp = new Date();
        orderItemList = new ArrayList<OrderItem>();
    }

    public Date getConsumeTimeStamp() {
        return consumeTimeStamp;
    }

    public void consume() {
        this.isConsumed = true;
        this.consumeTimeStamp = new Date();
        if (this.payment.isOnlinePayment()) {
            Business.getInstance().getSystemFinance().orderPaidOnlineConsumed(this);
            this.restaurant.getRestaurantFinance().orderPaidOnlineConsumed(this);
        } else {
            Business.getInstance().getSystemFinance().OrderPaidOfflineConsumed(this);
            this.restaurant.getRestaurantFinance().orderPaidOfflineConsumed(this);
        }
    }

    public boolean isIsConsumed() {
        return isConsumed;
    }

    public Ticket generateTicket() {
        ticket = TicketGenerater.generateTicket();
        return ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Customer getCustomer() {
        return customer;
    }

    public float getCalorieBalance() {
        float calorie = 0;
        for (OrderItem oi : this.orderItemList) {
            calorie += oi.getDish().getCalorieBalance();
        }
        return calorie;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void generatePayment() {
        this.payment = new Payment();
        this.payment.setBalance(getBalance());
        this.payment.setOrder(this);
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderItem addOrderItem() {
        OrderItem newOrderItem = new OrderItem();
        this.orderItemList.add(newOrderItem);
        return newOrderItem;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public float getBalance() {
        float balance = 0;
        for (OrderItem oi : orderItemList) {
            balance += oi.getBalance();
        }
        return balance;
    }

//    public float getIncome() {
//        if (this.isIsConsumed()) {
//            float total = 0;
//            for (OrderItem oi : this.getOrderItemList()) {
//                total += oi.getBalance();
//            }
//            return this.restaurant.getIncomingPercentage() * total;
//        } else {
//            return 0;
//        }
//    }
    @Override
    public String toString() {
        return String.valueOf(this.orderId);
    }

}

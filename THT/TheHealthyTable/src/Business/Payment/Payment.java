/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

import Business.Business;
import Business.Order.Order;
import Business.User.Customer;

/**
 *
 * @author Alex
 */
public class Payment {

    private TypeofStatus status = TypeofStatus.Unpaid;
    private float balance;
    private float acturalPayment;
    private Order order;
    private float discount;
    private boolean onlinePayment = false;

    public Payment() {
        discount = Business.getInstance().getDiscounter().getDiscount();
    }

    public float getDiscount() {
        return discount;
    }

    public float getActuralPayment() {
        return acturalPayment;
    }

    public void setActuralPayment(float acturalPayment) {
        this.acturalPayment = acturalPayment;
    }

    public boolean isOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(boolean onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void payOnline() {
        //check card/name
        this.onlinePayment = true;
        this.acturalPayment = this.balance * this.discount;
        this.getOrder().generateTicket();
        this.status = TypeofStatus.Paid;
        Business.getInstance().getSystemFinance().orderPaidOnline(this.getOrder());
    }

    public void payOffline() {
        //check card/name
        this.onlinePayment = false;
        this.getOrder().generateTicket();
        this.status = TypeofStatus.PayOffLine;
    }

    public float getBalance() {
        return balance;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TypeofStatus getStatus() {
        return status;
    }

    public enum TypeofStatus {

        Unpaid("Unpaid"),
        Paid("Paid"),
        PayOffLine("Offline Payemnt");

        private String value;

        private TypeofStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

import Business.Order.Order;

/**
 *
 * @author Alex
 */
public class RestaurantFinance extends FinanceCore {

    public RestaurantFinance() {
        super();
    }

    public void orderPaidOnlineConsumed(Order order) {
        float tempIncome = order.getBalance();
        float tempOutcome = order.getBalance() * order.getRestaurant().getIncomingPercentage();
        income += tempIncome;
        outcome += tempOutcome;
        addHistory(new FinanceCore(tempIncome, tempOutcome, order));
    }

    public void orderPaidOfflineConsumed(Order order) {
        float tempOutcome = order.getBalance() * order.getRestaurant().getIncomingPercentage();
        outcome += tempOutcome;
        addHistory(new FinanceCore(0, tempOutcome, order));
    }
}

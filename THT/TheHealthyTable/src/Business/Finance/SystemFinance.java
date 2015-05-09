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
public class SystemFinance extends FinanceCore {

    public SystemFinance() {
        super();
    }

    public void orderPaidOnline(Order order) {
        float tempIncome = order.getPayment().getActuralPayment();
        income += tempIncome;
        addHistory(new FinanceCore(tempIncome, 0, order));
    }

    public void orderPaidOnlineConsumed(Order order) {
        float tempIncome = order.getRestaurant().getIncomingPercentage() * order.getBalance();
        float tempOutcome = order.getBalance();
        income += tempIncome;
        outcome += tempOutcome;
        addHistory(new FinanceCore(tempIncome, tempOutcome, order));
    }

    public void OrderPaidOfflineConsumed(Order order) {
        float tempIncome = order.getRestaurant().getIncomingPercentage() * order.getBalance();
        income += tempIncome;
        addHistory(new FinanceCore(tempIncome, 0, order));
    }
}

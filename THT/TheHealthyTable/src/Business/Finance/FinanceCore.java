/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Finance;

import Business.Order.Order;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class FinanceCore {

    private static int count = 1;
    private int financeId;
    protected float income;
    protected float outcome;
    protected Order order;
    protected ArrayList<FinanceCore> financeHistory;

    public FinanceCore() {
        financeId = count++;
        this.financeHistory = new ArrayList<FinanceCore>();
    }

    public FinanceCore(float income, float outcome, Order order) {
        financeId = count++;
        this.income = income;
        this.outcome = outcome;
        this.order = order;
    }

    protected void addHistory(FinanceCore fc) {
        financeHistory.add(fc);
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public float getBalance() {
        return income - outcome;
    }

    public float getIncome() {
        return income;
    }

    public float getOutcome() {
        return outcome;
    }

    public ArrayList<FinanceCore> getFinanceHistory() {
        return financeHistory;
    }

    public int getFinanceId() {
        return financeId;
    }

    @Override
    public String toString() {
        return String.valueOf(financeId);
    }

}

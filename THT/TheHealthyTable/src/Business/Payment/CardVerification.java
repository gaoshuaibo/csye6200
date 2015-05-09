/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

/**
 *
 * @author Alex
 */
public class CardVerification {

    private static CardVerification cardVerification;

    public static CardVerification getInstance() {
        if (cardVerification == null) {
            cardVerification = new CardVerification();
        }
        return cardVerification;

    }

    public boolean verifyCard(String cardNumber, String code, String expireMonth, String expireYear) {
        if (cardNumber.equals("1234567890123456") || code.equals("123") || expireMonth.equals("12") || expireYear.equals("12")) {
            return true;
        } else {
            return false;
        }
    }
}

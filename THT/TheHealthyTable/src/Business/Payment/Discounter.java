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
public class Discounter {

    private float discount = 1;
    private static Discounter discounter;

    public static Discounter getInstance() {
        if (discounter == null) {
            discounter = new Discounter();
        }
        return discounter;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

}

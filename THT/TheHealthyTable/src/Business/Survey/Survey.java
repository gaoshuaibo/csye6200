/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Survey;

import Business.Diet.Allergy;
import Business.Diet.EatingHabbit;

/**
 *
 * @author Alex
 */
public class Survey {

    private float budgetMin;
    private float budgetMax;
    private EatingHabbit eatingHabbit;
    private Allergy allergy;
    private TrendType trent = TrendType.Remain;

    public Survey() {

        eatingHabbit = new EatingHabbit();
        allergy = new Allergy();
    }

    public TrendType getTrent() {
        return trent;
    }

    public void setTrent(TrendType trent) {
        this.trent = trent;
    }

    public float getBudgetMin() {
        return budgetMin;
    }

    public void setBudgetMin(float budgetMin) {
        this.budgetMin = budgetMin;
    }

    public float getBudgetMax() {
        return budgetMax;
    }

    public void setBudgetMax(float budgetMax) {
        this.budgetMax = budgetMax;
    }

    public EatingHabbit getEatingHabbit() {
        return eatingHabbit;
    }

    public void setEatingHabbit(EatingHabbit eatingHabbit) {
        this.eatingHabbit = eatingHabbit;
    }

    public Allergy getAllergy() {
        return allergy;
    }

    public void setAllergy(Allergy allergy) {
        this.allergy = allergy;
    }

    public enum TrendType {

        LoseWeight("Lose Weight"),
        GainWeight("Gain Weight"),
        Remain("Remain");

        private String value;

        private TrendType(String value) {
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

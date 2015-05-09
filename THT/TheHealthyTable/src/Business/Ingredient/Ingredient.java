/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ingredient;

import Business.Common.CalorieTable;

/**
 *
 * @author Alex
 */
public class Ingredient {

    private static int count = 1;
    private int ingredientId;
    private String name;
    private IngredientType ingredientType;
    private int amount;

    public Ingredient() {
        this.ingredientId = count++;
    }

    public IngredientType getIngredientType() {
        return ingredientType;
    }

    public float calculateCalorie() {
        return CalorieTable.getCaloriePerAmount(ingredientType) * amount;
    }

    public void setIngredientType(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public enum IngredientType {

        Anchovies("Anchovies"),
        ArborioRice("ArborioRice"),
        BalsamicVinegar("BalsamicVinegar"),
        BayLeaves("BayLeaves"),
        BrownButter("BrownButter"),
        CaneSyrup("CaneSyrup"),
        Celery("Celery"),
        ChiliLimeRub("Chili-LimeRub"),
        Cilantro("Cilantro"),
        Cinnamon("Cinnamon"),
        CitricAcid("CitricAcid"),
        CreoleSeasoning("CreoleSeasoning"),
        Croutons("Croutons"),
        DijonMustard("DijonMustard"),
        Dill("Dill"),
        EspelettePepper("EspelettePepper"),
        FishSauce("FishSauce"),
        FrenchYellowMustard("French sYellowMustard"),
        Garlic("Garlic"),
        GulfShrimp("GulfShrimp"),
        Espresso("Espresso"),
        TheCraigieTrinity("TheCraigieTrinity"),
        Harissa("Harissa"),
        Horseradish("Horseradish"),
        KuzuRootStarch("KuzuRootStarch"),
        Lemon("Lemon"),
        BaconFat("BaconFat"),
        Mint("Mint"),
        PalmSugar("PalmSugar"),
        PandanusLeaves("PandanusLeaves"),
        FrenchSaltedButter("FrenchSaltedButter"),
        PeanutOil("PeanutOil"),
        PedroXiménezSherryVinegar("PedroXiménezSherryVinegar"),
        PickleJuice("PickleJuice"),
        RosePetals("RosePetals"),
        MascarponeCheese("MascarponeCheese"),
        Saffron("Saffron"),
        ShiroDashi("ShiroDashi"),
        SoySauce("SoySauce"),
        Mayonnaise("Mayonnaise"),
        PomegranateMolasses("PomegranateMolasses"),
        Sriracha("Sriracha"),
        TasmanianPepperberry("TasmanianPepperberry"),
        Sumac("Sumac"),
        ThaiCurryPaste("ThaiCurryPaste"),
        TomatoJam("TomatoJam"),
        WorcestershireSauce("WorcestershireSauce"),
        WhiteMiso("WhiteMiso"),
        XOSauce("XOSauce"),
        PickledJalapenos("PickledJalapenos");

        private String value;

        private IngredientType(String value) {
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

    @Override
    public String toString() {
        return name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Common;

import Business.Ingredient.Ingredient;
import Business.Survey.Survey;

/**
 *
 * @author Alex
 */
public class CalorieTable {

    public static float getCalorieMin(Survey.TrendType type) {
        if (type.equals(Survey.TrendType.GainWeight)) {
            return 1800;
        } else if (type.equals(Survey.TrendType.LoseWeight)) {
            return 1000;
        } else {
            return 1400;
        }
    }
    public static float getCalorieMax(Survey.TrendType type) {
        if (type.equals(Survey.TrendType.GainWeight)) {
            return 2200;
        } else if (type.equals(Survey.TrendType.LoseWeight)) {
            return 1400;
        } else {
            return 1800;
        }
    }
    public static float getCaloriePerAmount(Ingredient.IngredientType type) {
        switch (type) {
            case Anchovies:
                return 3;
            case ArborioRice:
                return 4;
            case BalsamicVinegar:
                return 5;
            case BayLeaves:
                return 2;
            case BrownButter:
                return 3;
            case CaneSyrup:
                return 2;
            case Celery:
                return 3;
            case ChiliLimeRub:
                return 4;
            case Cilantro:
                return 4;
            case Cinnamon:
                return 3;
            case CitricAcid:
                return 3;
            case CreoleSeasoning:
                return 3;
            case Croutons:
                return 3;
            case DijonMustard:
                return 2;
            case Dill:
                return 4;
            case EspelettePepper:
                return 3;
            case FishSauce:
                return 2;
            case FrenchYellowMustard:
                return 2;
            case Garlic:
                return 2;
            case GulfShrimp:
                return 5;
            case Espresso:
                return 1;
            case TheCraigieTrinity:
                return 5;
            case Harissa:
                return 5;
            case Horseradish:
                return 4;
            case KuzuRootStarch:
                return 6;
            case Lemon:
                return 1;
            case BaconFat:
                return 1;
            case Mint:
                return 3;
            case PalmSugar:
                return 3;
            case PandanusLeaves:
                return 4;
            case FrenchSaltedButter:
                return 2;
            case PeanutOil:
                return 3;
            case PedroXiménezSherryVinegar:
                return 4;
            case PickleJuice:
                return 4;
            case RosePetals:
                return 4;
            case MascarponeCheese:
                return 3;
            case Saffron:
                return 4;
            case ShiroDashi:
                return 5;
            case SoySauce:
                return 5;
            case Mayonnaise:
                return 5;
            case PomegranateMolasses:
                return 2;
            case Sriracha:
                return 2;
            case TasmanianPepperberry:
                return 2;
            case Sumac:
                return 4;
            case ThaiCurryPaste:
                return 4;
            case TomatoJam:
                return 5;
            case WorcestershireSauce:
                return 2;
            case WhiteMiso:
                return 3;
            case XOSauce:
                return 4;
            case PickledJalapenos:
                return 3;

            default:
                return 0;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Common;

import java.util.Date;
import org.jfree.data.time.Day;

/**
 *
 * @author Alex
 */
public class CalorieTrace {

    private Day day;
    private float calorie;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public float getCalorie() {
        return calorie;
    }

    public void setCalorie(float calorie) {
        this.calorie = calorie;
    }

}

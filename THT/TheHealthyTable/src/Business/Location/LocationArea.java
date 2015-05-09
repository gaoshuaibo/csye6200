/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

/**
 *
 * @author Alex
 */
public class LocationArea {

    public enum LocationAreaType {

        Boston("Boston"),
        Cambridge("Cambridge"),
        Malden("Malden"),
        Revere("Revere");

        private String value;

        private LocationAreaType(String value) {
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

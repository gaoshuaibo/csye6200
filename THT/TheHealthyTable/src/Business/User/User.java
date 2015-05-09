/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Location.LocationArea;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Alex
 */
public class User {
    private String name;
    private static int count = 1;
    private int userId;
    private int age;
    private LocationArea.LocationAreaType locationArea;
    private GenderType gender = GenderType.Unknown;
    private String address;
    private UserAccount userAccount;

    public User() {
        userId = count++;
    }
    public enum GenderType {

        Male("Male"),
        FeMale("FeMale"),
        Unknown("Unknown");

        private String value;

        private GenderType(String value) {
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
    public String getName() {
        return name;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public LocationArea.LocationAreaType getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(LocationArea.LocationAreaType locationArea) {
        this.locationArea = locationArea;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.User.User;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount createUserAccount(String userName, String password, Role role, User user) {
        UserAccount ua = new UserAccount();
        ua.setUser(user);
        ua.setPassword(password);
        ua.setUserName(userName);
        ua.setRole(role);
        user.setUserAccount(ua);
        userAccountList.add(ua);
        return ua;
    }

    public UserAccount authenticateUser(String userName, String password) {
        for(UserAccount ua: userAccountList){
            if(ua.getUserName().equals(userName)&&ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }

    public UserAccount searchUserAccount(String name) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(name)) {
                return ua;
            }
        }
        return null;
    }
}

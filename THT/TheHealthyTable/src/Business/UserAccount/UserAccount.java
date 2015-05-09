/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import Business.User.User;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author Alex
 */
public class UserAccount {

    private static int count = 1;
    private int userAccountId;
    private User user;
    private AccountStatusType status;
    private Role role;
    private String userName;
    private String password;
    private WorkQueue workQueue;

    public UserAccount() {
        this.userAccountId = count++;
        workQueue = new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public int getUserAccountId() {
        return userAccountId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AccountStatusType getStatus() {
        return status;
    }

    public void setStatus(AccountStatusType status) {
        this.status = status;
    }



    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public enum AccountStatusType {

        Active("Active"),
        Inactive("Inactive");

        private String value;

        private AccountStatusType(String value) {
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
        return String.valueOf(userAccountId);
    }
}

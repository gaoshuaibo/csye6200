/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public abstract class Organization {
    private UserAccountDirectory userAccountDirectory;
    private String orgName;
    private int orgId;
    private WorkQueue workQueue;
    private static int counter = 1;
    private TypeofOrg orgType;
    
    public Organization(TypeofOrg orgType) {
        this.orgName = orgType.getValue();
        this.orgType = orgType;
        userAccountDirectory = new UserAccountDirectory();
        orgId = counter++;
        workQueue = new WorkQueue();
    }

    public TypeofOrg getOrgType() {
        return orgType;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public enum TypeofOrg {

        Admin("Admin"),
        Restaurant("Restaurant"),
        Customer("Customer"),
        Sales("Sales"),
        CustomerService("CustomerService"),
        Finance("Finance");

        private String value;

        private TypeofOrg(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value + " Organization";
        }
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return orgName;
    }

}

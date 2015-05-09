/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.User.Customer;
import Business.User.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class CustomerOrganization extends Organization {

    public CustomerOrganization() {
        super(Organization.TypeofOrg.Customer);
    }

    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> list = new ArrayList<Customer>();
        for (UserAccount ua : super.getUserAccountDirectory().getUserAccountList()) {
            list.add((Customer) ua.getUser());
        }
        return list;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new CustomerRole());
        return roles;
    }
}

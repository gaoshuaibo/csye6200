/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public UserAccount searchUserAccount(String accountName) {
        for (Organization o : organizationList) {
            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUserName().equals(accountName)) {
                    return ua;
                }
            }
        }
        return null;
    }

    public Organization createOrganization(Organization.TypeofOrg type) {
        Organization org = null;

        if (type.getValue().equals(Organization.TypeofOrg.Admin.getValue())) {
            org = new AdminOrganization();
            organizationList.add(org);
        }
        if (type.getValue().equals(Organization.TypeofOrg.Customer.getValue())) {
            org = new CustomerOrganization();
            organizationList.add(org);
        }
        if (type.getValue().equals(Organization.TypeofOrg.Restaurant.getValue())) {
            org = new RestaurantOrganization();
            organizationList.add(org);
        }
        if (type.getValue().equals(Organization.TypeofOrg.Sales.getValue())) {
            org = new SalesOrganization();
            organizationList.add(org);
        }
        if (type.getValue().equals(Organization.TypeofOrg.CustomerService.getValue())) {
            org = new CustomerServiceOrganization();
            organizationList.add(org);
        }
        if (type.getValue().equals(Organization.TypeofOrg.Finance.getValue())) {
            org = new FinanceOrganization();
            organizationList.add(org);
        }
        return org;
    }

    public RestaurantOrganization getRestaurantOrganization() {
        for (Organization o : organizationList) {
            if (o instanceof RestaurantOrganization) {
                return (RestaurantOrganization) o;
            }
        }
        return null;
    }

    public CustomerOrganization getCustomerOrganization() {
        for (Organization o : organizationList) {
            if (o instanceof CustomerOrganization) {
                return (CustomerOrganization) o;
            }
        }
        return null;
    }
}

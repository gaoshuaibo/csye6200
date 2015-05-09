/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Business;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.User.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;

/**
 *
 * @author raunak
 */
public class EnrollmentWorkRequest extends WorkRequest {

    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public static void sendRequest(String msg, UserAccount ua) {
        EnrollmentWorkRequest r = new EnrollmentWorkRequest();
        r.setMessage(msg);
        r.setStatus(RequestStatusType.Pending);
        r.setSender(ua);
        r.setRestaurant((Restaurant)ua.getUser());

        Organization org = null;
        for (Organization o : Business.getInstance().getOrgDirectory().getOrganizationList()) {
            if (o instanceof SalesOrganization) {
                org = o;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(r);
            ua.getWorkQueue().getWorkRequestList().add(r);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Finance.SystemFinance;
import Business.Order.OrderDirectory;
import Business.Organization.OrganizationDirectory;
import Business.Payment.Discounter;

/**
 *
 * @author Alex
 */
public class Business {

    private static Business business;
    private OrganizationDirectory orgDirectory;
    private OrderDirectory orderDirectory;
    private SystemFinance systemFinance;
    private Discounter discounter;
    private static boolean isFirstTimeRunning = true;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;

    }

    public Business() {
        orgDirectory = new OrganizationDirectory();
        orderDirectory = new OrderDirectory();
        systemFinance = new SystemFinance();
        discounter = Discounter.getInstance();
    }

    public Discounter getDiscounter() {
        return discounter;
    }

    public void setDiscounter(Discounter discounter) {
        this.discounter = discounter;
    }

    public static boolean isIsFirstTimeRunning() {
        return isFirstTimeRunning;
    }

    public static void setIsFirstTimeRunning(boolean isFirstTimeRunning) {
        Business.isFirstTimeRunning = isFirstTimeRunning;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public OrganizationDirectory getOrgDirectory() {
        return orgDirectory;
    }

    public void setOrgDirectory(OrganizationDirectory orgDirectory) {
        this.orgDirectory = orgDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public SystemFinance getSystemFinance() {
        return systemFinance;
    }

    public void setSystemFinance(SystemFinance systemFinance) {
        this.systemFinance = systemFinance;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Access;

import Business.Business;
import Business.Location.LocationArea;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.CustomerServiceRole;
import Business.Role.RestaurantRole;
import Business.Role.Role;
import Business.Role.SalesRole;
import Business.User.Admin;
import Business.User.Customer;
import Business.User.CustomerService;
import Business.User.Restaurant;
import Business.User.Sales;
import Business.User.User;
import Business.User.User.GenderType;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccount.AccountStatusType;
import Business.WorkRequest.EnrollmentWorkRequest;
import DataManagement.DatabaseFactory;
import UserInterface.MainJFrame;
import UserInterface.Sales.EnrollmentRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class RegisterJPanel extends javax.swing.JPanel {

    private Business business;
    private JPanel userProcessContainer;

    /**
     * Creates new form RegisterJPanel
     */
    public RegisterJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = Business.getInstance();
        populateComboLocation();
        populateCustomerComboGender();
    }

    public void populateComboLocation() {
        comboCustomerLocation.removeAllItems();
        comboRestaurantLocation.removeAllItems();
        for (LocationArea.LocationAreaType location : LocationArea.LocationAreaType.values()) {
            comboCustomerLocation.addItem(location);
            comboRestaurantLocation.addItem(location);
        }
    }

    public void populateCustomerComboGender() {
        comboCustomerGender.removeAllItems();
        for (User.GenderType gender : User.GenderType.values()) {
            comboCustomerGender.addItem(gender);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboCustomerLocation = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboCustomerGender = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerAccountName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerPassword = new javax.swing.JPasswordField();
        btCustomerSubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboRestaurantLocation = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtRestaurantAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRestaurantAccountName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRestaurantPassword = new javax.swing.JPasswordField();
        btRestaurantSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        tab.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 20));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0, 5, 0};
        jPanel4Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel4.setLayout(jPanel4Layout);

        jLabel1.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel1, gridBagConstraints);

        txtCustomerName.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(txtCustomerName, gridBagConstraints);

        jLabel2.setText("Age:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel2, gridBagConstraints);

        txtCustomerAge.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(txtCustomerAge, gridBagConstraints);

        jLabel3.setText("Location:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel3, gridBagConstraints);

        comboCustomerLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCustomerLocation.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(comboCustomerLocation, gridBagConstraints);

        jLabel4.setText("Gender:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel4, gridBagConstraints);

        comboCustomerGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCustomerGender.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(comboCustomerGender, gridBagConstraints);

        jLabel5.setText("Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel5, gridBagConstraints);

        txtCustomerAddress.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(txtCustomerAddress, gridBagConstraints);

        jLabel6.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel6, gridBagConstraints);

        txtCustomerAccountName.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(txtCustomerAccountName, gridBagConstraints);

        jLabel7.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jLabel7, gridBagConstraints);

        txtCustomerPassword.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(txtCustomerPassword, gridBagConstraints);

        btCustomerSubmit.setText("Submit");
        btCustomerSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCustomerSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCustomerSubmit)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(562, Short.MAX_VALUE))
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCustomerSubmit)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("I'm Customer", tab);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 20));
        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel5Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel5.setLayout(jPanel5Layout);

        jLabel8.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(jLabel8, gridBagConstraints);

        txtRestaurantName.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(txtRestaurantName, gridBagConstraints);

        jLabel10.setText("Location:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(jLabel10, gridBagConstraints);

        comboRestaurantLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRestaurantLocation.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(comboRestaurantLocation, gridBagConstraints);

        jLabel12.setText("Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(jLabel12, gridBagConstraints);

        txtRestaurantAddress.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(txtRestaurantAddress, gridBagConstraints);

        jLabel13.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(jLabel13, gridBagConstraints);

        txtRestaurantAccountName.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(txtRestaurantAccountName, gridBagConstraints);

        jLabel14.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(jLabel14, gridBagConstraints);

        txtRestaurantPassword.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel5.add(txtRestaurantPassword, gridBagConstraints);

        btRestaurantSubmit.setText("Submit");
        btRestaurantSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaurantSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRestaurantSubmit)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRestaurantSubmit)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("I'm Restaurant", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCustomerSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCustomerSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtCustomerName.getText().trim();
        LocationArea.LocationAreaType location = (LocationArea.LocationAreaType) comboCustomerLocation.getSelectedItem();
        GenderType gender = (GenderType) comboCustomerGender.getSelectedItem();
        String address = txtCustomerAddress.getText().trim();
        String email = txtCustomerAccountName.getText().trim();
        char[] tempPassword = txtCustomerPassword.getPassword();
        String password = String.valueOf(tempPassword);
        int age = 0;
        try {
            age = Integer.parseInt(txtCustomerAge.getText().trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        if (name.equals("") || location == null || gender == null || address.equals("") || email.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        if (business.getOrgDirectory().searchUserAccount(email) != null) {
            JOptionPane.showMessageDialog(null, "User name already exist.");
            return;
        }
        Customer user = new Customer();
        user.setName(name);
        user.setAge(age);
        user.setLocationArea(location);
        user.setGender(gender);
        user.setAddress(address);

        UserAccount ua = business.getOrgDirectory().getCustomerOrganization().getUserAccountDirectory().createUserAccount(email, password, new CustomerRole(), user);

        ua.setStatus(AccountStatusType.Active);

        DatabaseFactory.getInstance().storeSystem();

        JOptionPane.showMessageDialog(null, "User account created.");

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btCustomerSubmitActionPerformed

    private void btRestaurantSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaurantSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtRestaurantName.getText().trim();
        LocationArea.LocationAreaType location = (LocationArea.LocationAreaType) comboCustomerLocation.getSelectedItem();
        String address = txtRestaurantAddress.getText().trim();
        String email = txtRestaurantAccountName.getText().trim();
        char[] tempPassword = txtRestaurantPassword.getPassword();
        String password = String.valueOf(tempPassword);
        if (name.equals("") || location == null || address.equals("") || email.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        if (business.getOrgDirectory().searchUserAccount(email) != null) {
            JOptionPane.showMessageDialog(null, "User name already exist.");
            return;
        }
        Restaurant user = new Restaurant();
        user.setName(name);
        user.setLocationArea(location);
        user.setAddress(address);

        UserAccount ua = business.getOrgDirectory().getRestaurantOrganization().getUserAccountDirectory().createUserAccount(email, password, new RestaurantRole(), user);

        ua.setStatus(AccountStatusType.Inactive);

        EnrollmentWorkRequest.sendRequest("New restaurant registerd", ua);

        DatabaseFactory.getInstance().storeSystem();

        JOptionPane.showMessageDialog(null, "User account created.");

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btRestaurantSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCustomerSubmit;
    private javax.swing.JButton btRestaurantSubmit;
    private javax.swing.JComboBox comboCustomerGender;
    private javax.swing.JComboBox comboCustomerLocation;
    private javax.swing.JComboBox comboRestaurantLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel tab;
    private javax.swing.JTextField txtCustomerAccountName;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerAge;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JPasswordField txtCustomerPassword;
    private javax.swing.JTextField txtRestaurantAccountName;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JPasswordField txtRestaurantPassword;
    // End of variables declaration//GEN-END:variables
}
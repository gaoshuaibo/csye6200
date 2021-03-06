/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Sales;

import Business.Business;
import Business.Organization.Organization;
import Business.Organization.RestaurantOrganization;
import Business.User.Restaurant;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccount.AccountStatusType;
import DataManagement.DatabaseFactory;
import UserInterface.Restaurant.ManageMenuJPanel;
import UserInterface.Restaurant.RestaurantProfileJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {

    Business business;
    JPanel userProcessContainer;

    /**
     * Creates new form ManageRestaurantJPanel
     */
    public ManageRestaurantJPanel(JPanel userProcessContainer) {
        initComponents();
        business = Business.getInstance();
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRestaurant.getModel();
        model.setRowCount(0);
        for (Restaurant r : business.getOrgDirectory().getRestaurantOrganization().getAllRestaurant()) {
            Object[] row = new Object[5];
            row[0] = r.getRestaurantId();
            row[1] = r;
            row[2] = r.getLocationArea();
            row[3] = r.getAddress();
            row[4] = r.getIncomingPercentage();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();
        btViewRestaurant = new javax.swing.JButton();
        btDisableRestaurant = new javax.swing.JButton();
        btViewRestaurantMenu = new javax.swing.JButton();
        btSetIncomingPercentage = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Location", "Address", "Incoming Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurant);

        btViewRestaurant.setText("Update Restaurant Profile");
        btViewRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewRestaurantActionPerformed(evt);
            }
        });

        btDisableRestaurant.setText("Disable Restaurant");
        btDisableRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisableRestaurantActionPerformed(evt);
            }
        });

        btViewRestaurantMenu.setText("View Restaurant Menu");
        btViewRestaurantMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewRestaurantMenuActionPerformed(evt);
            }
        });

        btSetIncomingPercentage.setText("Set Incoming Percentage");
        btSetIncomingPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetIncomingPercentageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btViewRestaurant)
                        .addGap(18, 18, 18)
                        .addComponent(btViewRestaurantMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btDisableRestaurant)
                        .addGap(18, 18, 18)
                        .addComponent(btSetIncomingPercentage)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btViewRestaurant)
                    .addComponent(btViewRestaurantMenu)
                    .addComponent(btDisableRestaurant)
                    .addComponent(btSetIncomingPercentage))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btViewRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewRestaurantActionPerformed
        int row = tblRestaurant.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "PLease select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant r = (Restaurant) tblRestaurant.getValueAt(row, 1);

        RestaurantProfileJPanel panel = new RestaurantProfileJPanel(userProcessContainer, r);
        userProcessContainer.add("RestaurantProfileJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btViewRestaurantActionPerformed

    private void btViewRestaurantMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewRestaurantMenuActionPerformed
        // TODO add your handling code here:
        int row = tblRestaurant.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "PLease select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant r = (Restaurant) tblRestaurant.getValueAt(row, 1);

        ManageMenuJPanel panel = new ManageMenuJPanel(userProcessContainer, r);
        userProcessContainer.add("ManageMenuJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btViewRestaurantMenuActionPerformed

    private void btDisableRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisableRestaurantActionPerformed
        // TODO add your handling code here:
        int row = tblRestaurant.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "PLease select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant r = (Restaurant) tblRestaurant.getValueAt(row, 1);
        r.getUserAccount().setStatus(AccountStatusType.Inactive);
        DatabaseFactory.getInstance().storeSystem();
        JOptionPane.showMessageDialog(null, "Disabled");
        populateTable();
    }//GEN-LAST:event_btDisableRestaurantActionPerformed

    private void btSetIncomingPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSetIncomingPercentageActionPerformed
        // TODO add your handling code here:
        int row = tblRestaurant.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "PLease select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant r = (Restaurant) tblRestaurant.getValueAt(row, 1);

        float percentage = 0;
        String input = JOptionPane.showInputDialog("New percentage:");

        try {
            percentage = Float.parseFloat(input);
            if (percentage > 1 || percentage < 0) {
                JOptionPane.showMessageDialog(null, "Invalid input");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            return;
        }

        r.setIncomingPercentage(percentage);
        DatabaseFactory.getInstance().storeSystem();
        populateTable();
        JOptionPane.showMessageDialog(null, "Percentage changed");

    }//GEN-LAST:event_btSetIncomingPercentageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDisableRestaurant;
    private javax.swing.JButton btSetIncomingPercentage;
    private javax.swing.JButton btViewRestaurant;
    private javax.swing.JButton btViewRestaurantMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurant;
    // End of variables declaration//GEN-END:variables
}

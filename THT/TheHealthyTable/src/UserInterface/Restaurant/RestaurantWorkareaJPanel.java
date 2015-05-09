/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Restaurant;

import Business.Business;
import Business.User.Restaurant;
import UserInterface.Admin.*;
import java.awt.CardLayout;

/**
 *
 * @author Alex
 */
public class RestaurantWorkareaJPanel extends javax.swing.JPanel {

    Business business;
    Restaurant restaurant;

    /**
     * Creates new form AdminWorkareaJPanel
     */
    public RestaurantWorkareaJPanel(Restaurant restaurant) {
        initComponents();
        this.restaurant = restaurant;
        this.business = Business.getInstance();
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

        jPanel5 = new javax.swing.JPanel();
        splitWorkarea = new javax.swing.JSplitPane();
        indexJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btManageMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btMyProfile = new javax.swing.JButton();
        btMyFinance = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        splitWorkarea.setDividerLocation(200);
        splitWorkarea.setDividerSize(4);
        splitWorkarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        indexJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        btManageMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btManageMenu.setText("My Menu");
        btManageMenu.setPreferredSize(new java.awt.Dimension(170, 40));
        btManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btManageMenu, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("My Order");
        jButton1.setPreferredSize(new java.awt.Dimension(170, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jButton1, gridBagConstraints);

        btMyProfile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btMyProfile.setText("My Profile");
        btMyProfile.setPreferredSize(new java.awt.Dimension(170, 40));
        btMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMyProfileActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btMyProfile, gridBagConstraints);

        btMyFinance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btMyFinance.setText("My Finance");
        btMyFinance.setPreferredSize(new java.awt.Dimension(170, 40));
        btMyFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMyFinanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btMyFinance, gridBagConstraints);

        javax.swing.GroupLayout indexJPanelLayout = new javax.swing.GroupLayout(indexJPanel);
        indexJPanel.setLayout(indexJPanelLayout);
        indexJPanelLayout.setHorizontalGroup(
            indexJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        indexJPanelLayout.setVerticalGroup(
            indexJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        splitWorkarea.setLeftComponent(indexJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitWorkarea.setRightComponent(userProcessContainer);

        jPanel5.add(splitWorkarea, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageMenuActionPerformed
        // TODO add your handling code here:
        ManageMenuJPanel panel = new ManageMenuJPanel(userProcessContainer, restaurant);
        userProcessContainer.add("ManageMenuJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btManageMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RestaurantViewOrderJPanel panel = new RestaurantViewOrderJPanel(userProcessContainer, restaurant);
        userProcessContainer.add("RestaurantViewOrderJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btMyFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMyFinanceActionPerformed
        // TODO add your handling code here:
        RestaurantViewFinanceReportJPanel panel = new RestaurantViewFinanceReportJPanel(restaurant);
        userProcessContainer.add("RestaurantViewFinanceReportJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btMyFinanceActionPerformed

    private void btMyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMyProfileActionPerformed
        // TODO add your handling code here:
        RestaurantProfileJPanel panel = new RestaurantProfileJPanel(userProcessContainer, restaurant);
        userProcessContainer.add("RestaurantProfileJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btMyProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btManageMenu;
    private javax.swing.JButton btMyFinance;
    private javax.swing.JButton btMyProfile;
    private javax.swing.JPanel indexJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane splitWorkarea;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

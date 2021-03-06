/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerService;

import UserInterface.Admin.*;
import UserInterface.PostContainerJPanel;
import UserInterface.Sales.EnrollmentRequestJPanel;
import java.awt.CardLayout;

/**
 *
 * @author Alex
 */
public class CustomerServiceWorkareaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkareaJPanel
     */
    public CustomerServiceWorkareaJPanel() {
        initComponents();
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
        btManageCustomer = new javax.swing.JButton();
        btManageDiscount = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        splitWorkarea.setDividerLocation(200);
        splitWorkarea.setDividerSize(4);
        splitWorkarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        indexJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        btManageCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btManageCustomer.setText("Manage Customer");
        btManageCustomer.setPreferredSize(new java.awt.Dimension(170, 40));
        btManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btManageCustomer, gridBagConstraints);

        btManageDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btManageDiscount.setText("Manage Discount");
        btManageDiscount.setPreferredSize(new java.awt.Dimension(170, 40));
        btManageDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageDiscountActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(btManageDiscount, gridBagConstraints);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        splitWorkarea.setLeftComponent(indexJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitWorkarea.setRightComponent(userProcessContainer);

        jPanel5.add(splitWorkarea, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageCustomerActionPerformed
        // TODO add your handling code here:
        ManageCustomerJPanel panel = new ManageCustomerJPanel(userProcessContainer);
        userProcessContainer.add("ManageCustomerJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btManageCustomerActionPerformed

    private void btManageDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageDiscountActionPerformed
        // TODO add your handling code here:
        ManageDiscountJPanel panel = new ManageDiscountJPanel();
        userProcessContainer.add("ManageDiscountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btManageDiscountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btManageCustomer;
    private javax.swing.JButton btManageDiscount;
    private javax.swing.JPanel indexJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane splitWorkarea;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

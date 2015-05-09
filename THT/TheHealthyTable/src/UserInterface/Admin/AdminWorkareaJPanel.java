/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin;

import Business.Business;
import Business.ConfigureBusiness;
import java.awt.CardLayout;

/**
 *
 * @author Alex
 */
public class AdminWorkareaJPanel extends javax.swing.JPanel {

    private Business business;

    /**
     * Creates new form AdminWorkareaJPanel
     */
    public AdminWorkareaJPanel() {
        initComponents();
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
        btManageUserAccount = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        splitWorkarea.setDividerLocation(200);
        splitWorkarea.setDividerSize(4);
        splitWorkarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        indexJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        btManageUserAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btManageUserAccount.setText("Manage UserAccount");
        btManageUserAccount.setPreferredSize(new java.awt.Dimension(170, 40));
        btManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageUserAccountActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(btManageUserAccount, gridBagConstraints);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        splitWorkarea.setLeftComponent(indexJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitWorkarea.setRightComponent(userProcessContainer);

        jPanel5.add(splitWorkarea, java.awt.BorderLayout.CENTER);

        add(jPanel5, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel panel = new ManageUserAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageUserAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btManageUserAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btManageUserAccount;
    private javax.swing.JPanel indexJPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane splitWorkarea;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
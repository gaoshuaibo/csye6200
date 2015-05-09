/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Restaurant;

import UserInterface.Admin.*;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.*;
import Business.Ingredient.Ingredient;
import Business.Ingredient.Ingredient.IngredientType;
import Business.Menu.Dish;
import Business.Organization.Organization;
import Business.Role.AdminRole;
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
import DataManagement.DatabaseFactory;
import java.awt.CardLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class AddIngredientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ManageMenuJPanel parent;
    private Business business;
    private Dish dish;

    /**
     * Creates new form AddEmploeeJPanel
     */
    public AddIngredientJPanel(JPanel userProcessContainer, Business business, ManageMenuJPanel parent, Dish dish) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.parent = parent;
        this.dish = dish;
        populateIngredientType();
    }

    public void populateIngredientType() {
        cbIngredientType.removeAllItems();
        for (IngredientType it : IngredientType.values()) {
            cbIngredientType.addItem(it);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbIngredientType = new javax.swing.JComboBox();
        btBack = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel2.setText("Amount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel2, gridBagConstraints);

        txtAmount.setMaximumSize(new java.awt.Dimension(200, 20));
        txtAmount.setMinimumSize(new java.awt.Dimension(200, 20));
        txtAmount.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(txtAmount, gridBagConstraints);

        jLabel3.setText("Ingredient Type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel3, gridBagConstraints);

        cbIngredientType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbIngredientType.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(cbIngredientType, gridBagConstraints);

        btBack.setText("<< Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btSubmit.setText("Add");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btBack)
                        .addGap(192, 192, 192)
                        .addComponent(btSubmit))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack)
                    .addComponent(btSubmit))
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:
        int amount = 0;

        try {
            amount = Integer.parseInt(txtAmount.getText().trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }

        IngredientType type = (IngredientType) cbIngredientType.getSelectedItem();
        if (amount == 0 || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        Ingredient newIngredient = dish.getIngredientDirectory().addIngredient();
        newIngredient.setAmount(amount);
        newIngredient.setIngredientType(type);
        newIngredient.setName(type.getValue());
        DatabaseFactory.getInstance().storeSystem();
        JOptionPane.showMessageDialog(null, "Created");
        parent.populateDishTable();
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        parent.populateIngredientTable(dish);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbIngredientType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Restaurant;

import UserInterface.Admin.*;
import Business.UserAccount.UserAccountDirectory;
import Business.UserAccount.UserAccount;
import Business.*;
import Business.Ingredient.Ingredient;
import Business.Menu.Dish;
import Business.Organization.Organization;
import static Business.Organization.Organization.TypeofOrg.Restaurant;
import Business.User.Restaurant;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    private Restaurant restaurant;

    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageMenuJPanel(JPanel userProcessContainer, Restaurant restaurant) {
        initComponents();
        this.business = Business.getInstance();
        this.userProcessContainer = userProcessContainer;
        this.restaurant = restaurant;
        tblDish.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = tblDish.getSelectedRow();
                if (selectedRow >= 0) {
                    Dish dish = (Dish) tblDish.getValueAt(selectedRow, 0);
                    populateIngredientTable(dish);
                }
            }
        });
        populateDishTable();
    }

    public void populateDishTable() {
        DefaultTableModel model = (DefaultTableModel) tblDish.getModel();
        model.setRowCount(0);
        for (Dish d : restaurant.getMenu().getDishList()) {
            Object[] row = new Object[4];
            row[0] = d;
            row[1] = d.getName();
            row[2] = d.getImagePath();
            row[3] = d.getPrice();
            model.addRow(row);
        }
    }

    public void populateIngredientTable(Dish dish) {
        DefaultTableModel model = (DefaultTableModel) tblIngredient.getModel();
        model.setRowCount(0);
        for (Ingredient i : dish.getIngredientDirectory().getIngredientList()) {
            Object[] row = new Object[4];
            row[0] = i;
            row[1] = i.getName();
            row[2] = i.getAmount();
            row[3] = i.getIngredientType();
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
        tblIngredient = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDish = new javax.swing.JTable();
        btAddIngredient = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblIngredient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ingredient Name", "Amount", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIngredient);

        btAdd.setText("Add Dish");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        tblDish.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Dish Name", "Image", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDish);

        btAddIngredient.setText("Add Ingredient");
        btAddIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddIngredientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddIngredient))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btAddIngredient))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        AddDishJPanel panel = new AddDishJPanel(userProcessContainer, business, this, restaurant);
        userProcessContainer.add("AddDishJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btAddActionPerformed

    private void btAddIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddIngredientActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblDish.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        Dish dish = (Dish) tblDish.getValueAt(selectedRow, 0);

        AddIngredientJPanel panel = new AddIngredientJPanel(userProcessContainer, business, this, dish);
        userProcessContainer.add("AddIngredientJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btAddIngredientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAddIngredient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDish;
    private javax.swing.JTable tblIngredient;
    // End of variables declaration//GEN-END:variables
}

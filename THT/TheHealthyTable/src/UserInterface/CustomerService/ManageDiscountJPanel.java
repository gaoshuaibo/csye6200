/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerService;

import Business.Business;
import Business.Payment.Discounter;
import DataManagement.DatabaseFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class ManageDiscountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDiscountJPanel
     */
    public ManageDiscountJPanel() {
        initComponents();
        txtDiscount.setText(String.valueOf(Business.getInstance().getDiscounter().getDiscount()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Discount");

        txtDiscount.setEnabled(false);

        btSubmit.setText("Submit");
        btSubmit.setEnabled(false);
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSubmit)))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUpdate)
                    .addComponent(btSubmit))
                .addContainerGap(436, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:
        float discount = 1;
        try {
            discount = Float.parseFloat(txtDiscount.getText().trim());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }
        if (discount < 0 || discount > 1) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            return;
        }

        Business.getInstance().getDiscounter().setDiscount(discount);
        DatabaseFactory.getInstance().storeSystem();
        btSubmit.setEnabled(false);
        btUpdate.setEnabled(true);
        txtDiscount.setEnabled(false);
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        txtDiscount.setEnabled(true);
        btSubmit.setEnabled(true);
        btUpdate.setEnabled(false);
    }//GEN-LAST:event_btUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDiscount;
    // End of variables declaration//GEN-END:variables
}

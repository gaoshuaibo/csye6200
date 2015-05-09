/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Sales;

import Business.Organization.SalesOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.EnrollmentWorkRequest;
import Business.WorkRequest.WorkRequest;
import DataManagement.DatabaseFactory;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class EnrollmentRequestJPanel extends javax.swing.JPanel {

    SalesOrganization salesOrganization;
    private JPanel userProcessContainer;
    UserAccount ua;

    /**
     * Creates new form EnrollmentRequestJPanel
     */
    public EnrollmentRequestJPanel(JPanel userProcessContainer, SalesOrganization s, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salesOrganization = s;
        this.ua = ua;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);

        for (WorkRequest r : salesOrganization.getWorkQueue().getWorkRequestList()) {
            if (r instanceof EnrollmentWorkRequest) {
                Object[] row = new Object[8];
                row[0] = (EnrollmentWorkRequest) r;
                row[1] = r.getSender().getUser().getName();
                row[2] = r.getReceiver() == null ? null : r.getReceiver().getUser().getName();
                row[3] = r.getStatus();
                row[4] = r.getRequestDate();
                row[5] = r.getResolveDate();
                row[6] = r.getMessage();
                row[7] = r.getSender().getStatus();
                model.addRow(row);
            }
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
        tblRequest = new javax.swing.JTable();
        btApprove = new javax.swing.JButton();
        btReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Sender", "Receiver", "Status", "Request Date", "Resolve Date", "Message", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequest);

        btApprove.setText("Approve Enrollment");
        btApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApproveActionPerformed(evt);
            }
        });

        btReject.setText("Reject Enrollment");
        btReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btApprove)
                        .addGap(18, 18, 18)
                        .addComponent(btReject)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btApprove)
                    .addComponent(btReject))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApproveActionPerformed
        // TODO add your handling code here:
        int row = tblRequest.getSelectedRow();

        if (row < 0) {
            return;
        }
        EnrollmentWorkRequest r = (EnrollmentWorkRequest) tblRequest.getValueAt(row, 0);
        if (r.getStatus() == WorkRequest.RequestStatusType.Resolved) {
            JOptionPane.showMessageDialog(null, "This request is already resloved");
            return;
        }
        r.setReceiver(ua);
        r.getSender().setStatus(UserAccount.AccountStatusType.Active);
        r.setStatus(WorkRequest.RequestStatusType.Resolved);
        r.setResolveDate(new Date());
        DatabaseFactory.getInstance().storeSystem();
        JOptionPane.showMessageDialog(null, "Approved");
        populateTable();

    }//GEN-LAST:event_btApproveActionPerformed

    private void btRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRejectActionPerformed
        // TODO add your handling code here:
        int row = tblRequest.getSelectedRow();

        if (row < 0) {
            return;
        }
        EnrollmentWorkRequest r = (EnrollmentWorkRequest) tblRequest.getValueAt(row, 0);
        if (r.getStatus() == WorkRequest.RequestStatusType.Resolved) {
            JOptionPane.showMessageDialog(null, "This request is already resloved");
            return;
        }
        r.setReceiver(ua);
        r.getSender().setStatus(UserAccount.AccountStatusType.Inactive);
        r.setStatus(WorkRequest.RequestStatusType.Resolved);
        r.setResolveDate(new Date());
        DatabaseFactory.getInstance().storeSystem();
        JOptionPane.showMessageDialog(null, "Rejected");
        populateTable();
    }//GEN-LAST:event_btRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApprove;
    private javax.swing.JButton btReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
}
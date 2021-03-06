/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import UserInterface.Access.SignInJDialog;
import Business.Business;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import DataManagement.DatabaseFactory;
import UserInterface.Access.RegisterJPanel;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class MainJFrame extends javax.swing.JFrame {

    private Business business;
    private UserAccount userAccount;
    private Organization organization;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        try {
            this.setIconImage(Toolkit.getDefaultToolkit().getImage("Icons//THT.png"));
        } catch (Exception ex) {
        }
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        //this.business = Business.getInstance();
        this.business = DatabaseFactory.getInstance().retrieveSystem();
        if (Business.isIsFirstTimeRunning()) {
            DatabaseFactory.getInstance().storeSystem();
        }
        populateHomePage();
    }

    public void populateHomePage() {
        if (userAccount == null) {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            AnonymousWorkareaJPanel jpanel = new AnonymousWorkareaJPanel(userProcessContainer);
            userProcessContainer.add("workArea", jpanel);
            layout.next(userProcessContainer);
        } else {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("workArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, organization, business));
            layout.next(userProcessContainer);
        }
    }

    public void populateRegisterPage() {
        if (userAccount != null) {
            logout();
        }
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        RegisterJPanel jpanel = new RegisterJPanel(userProcessContainer);
        userProcessContainer.add("RegisterJPanel", jpanel);
        layout.next(userProcessContainer);
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

        jPanel3 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btHealthyTable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btSignIn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1040, 635));
        setMinimumSize(new java.awt.Dimension(1040, 635));
        setPreferredSize(new java.awt.Dimension(1040, 635));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setDividerLocation(50);
        jSplitPane2.setDividerSize(0);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel6Layout = new java.awt.GridBagLayout();
        jPanel6Layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanel6Layout.rowHeights = new int[] {0};
        jPanel6.setLayout(jPanel6Layout);

        btHealthyTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btHealthyTable.setText("Healthy Table");
        btHealthyTable.setPreferredSize(new java.awt.Dimension(150, 30));
        btHealthyTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHealthyTableActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel6.add(btHealthyTable, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/TNT_32X32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel6.add(jLabel1, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel8Layout = new java.awt.GridBagLayout();
        jPanel8Layout.columnWidths = new int[] {0, 10, 0};
        jPanel8Layout.rowHeights = new int[] {0};
        jPanel8.setLayout(jPanel8Layout);

        btSignIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSignIn.setText("Sign In");
        btSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignInActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel8.add(btSignIn, gridBagConstraints);

        jTextField1.setText("Search here");
        jTextField1.setMaximumSize(new java.awt.Dimension(150, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(150, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel8.add(jTextField1, gridBagConstraints);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 564, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 13, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane2.setTopComponent(jPanel4);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(userProcessContainer);

        jPanel3.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignInActionPerformed
        // TODO add your handling code here:
        if (this.userAccount == null) {
            SignInJDialog dialog = new SignInJDialog(this, true, business);
            dialog.setVisible(true);
            UserAccount ua = dialog.getReturnValue();
            if (ua != null) {
                userAccount = ua;
                organization = dialog.getOrganization();
                btSignIn.setText("Log Out");
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("workArea", ua.getRole().createWorkArea(userProcessContainer, userAccount, organization, business));
                layout.next(userProcessContainer);
            }
        } else {
            logout();
            populateHomePage();
        }
    }//GEN-LAST:event_btSignInActionPerformed
    private void logout() {
        this.userAccount = null;
        this.organization = null;
        btSignIn.setText("Sign In");
    }
    private void btHealthyTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHealthyTableActionPerformed
        // TODO add your handling code here:
        populateHomePage();
    }//GEN-LAST:event_btHealthyTableActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
                    UIManager.setLookAndFeel(lookAndFeel);
                } catch (Exception ex) {
                }
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHealthyTable;
    private javax.swing.JButton btSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

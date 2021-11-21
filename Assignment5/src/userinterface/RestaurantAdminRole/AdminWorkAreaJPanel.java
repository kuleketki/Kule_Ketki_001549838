package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel displayPanel;
    private UserAccount adminAccount;
    private EcoSystem ecoSystem;
    private Menu menu;
    private Restaurant restaurant;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.displayPanel = userProcessContainer;
        this.ecoSystem = business;
        this.adminAccount = account;

        for (Restaurant restaurant : business.getRestaurantDirectory().getRestaurantList()) {

            if (account.getEmployee().getId() == restaurant.getAccountId()) {
                this.restaurant = restaurant;
                this.menu = restaurant.getMenu();
                valueLabel.setText(restaurant.getRestaurantName());
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        btnManageMenu = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        lblRestaurantName = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        userJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userJButton.setText("Manage Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 270, 70));

        btnManageMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageMenu.setText("Manage Menu");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });
        add(btnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 270, 70));

        btnManageOrders.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 270, 70));

        lblRestaurantName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRestaurantName.setText("Restaurant Name :");
        add(lblRestaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 190, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        RestaurantInfoJPanel workArea = new RestaurantInfoJPanel(displayPanel, adminAccount, restaurant);
        displayPanel.add("RestaurantInfoJPanel", workArea);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        ManageMenuJPanel workArea = new ManageMenuJPanel(displayPanel, restaurant);
        displayPanel.add("ManageMenuJPanel", workArea);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        ManageOrderJPanel workArea = new ManageOrderJPanel(displayPanel, adminAccount, ecoSystem, restaurant);
        displayPanel.add("ManageOrderJPanel", workArea);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnManageOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}

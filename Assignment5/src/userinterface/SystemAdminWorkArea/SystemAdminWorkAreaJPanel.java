/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel displayPanel;
    private EcoSystem ecosystem;

    public SystemAdminWorkAreaJPanel(JPanel displayPanel, EcoSystem ecosystem) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecosystem = ecosystem;
        populateTree();
    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        // Add the code for draw your system structure shown by JTree
        DefaultMutableTreeNode treeRoot = (DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode("Admin");
        treeRoot.removeAllChildren();
        treeRoot.insert(treeNode, 0);

        ArrayList<DeliveryMan> deliveryManList = ecosystem.getDeliveryManDirectory().getDeliveryManList();
        ArrayList<Restaurant> restaurantList = ecosystem.getRestaurantDirectory().getRestaurantList();
        ArrayList<Customer> customerList = ecosystem.getCustomerDirectory().getCustomerList();

        DefaultMutableTreeNode customerRoot = new DefaultMutableTreeNode("Customer");
        DefaultMutableTreeNode deliverManRoot = new DefaultMutableTreeNode("Delivery Man");
        DefaultMutableTreeNode restaurantManagerRoot = new DefaultMutableTreeNode("Restaurant");

        DefaultMutableTreeNode deliveryNode;
        DefaultMutableTreeNode customerNode;
        DefaultMutableTreeNode restaurantNode;

        for (int i = 0; i < deliveryManList.size(); i++) {
            deliveryNode = new DefaultMutableTreeNode(deliveryManList.get(i).getName());
            deliverManRoot.insert(deliveryNode, i);
        }

        for (int i = 0; i < restaurantList.size(); i++) {
            restaurantNode = new DefaultMutableTreeNode(restaurantList.get(i).getRestaurantName());
            restaurantManagerRoot.insert(restaurantNode, i);
        }

        for (int i = 0; i < customerList.size(); i++) {
            customerNode = new DefaultMutableTreeNode(customerList.get(i).getFullName());
            customerRoot.insert(customerNode, i);
        }

        treeNode.insert(deliverManRoot, 0);
        treeNode.insert(customerRoot, 1);
        treeNode.insert(restaurantManagerRoot, 2);

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();
        btnManageDeliveryMan = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 551, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Selected Node:");

        lblSelectedNode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSelectedNode.setText("<View_selected_node>");

        btnManageCustomers.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnManageCustomers.setText("Manage All Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageRestaurants.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        btnManageDeliveryMan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnManageDeliveryMan.setText("Manage Deliveryman");
        btnManageDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                .addComponent(lblSelectedNode)
                .addGap(197, 197, 197))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageDeliveryMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageRestaurants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectedNode))
                .addGap(114, 114, 114)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnManageRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnManageDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        CustomerJPanel workArea = new CustomerJPanel(displayPanel, ecosystem);
        displayPanel.add("CustomerJPanel", workArea);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        RestaurantJPanel workArea = new RestaurantJPanel(displayPanel, ecosystem);
        displayPanel.add("RestaurantJPanel", workArea);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnManageDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryManActionPerformed
        DeliveryManJPanel workArea = new DeliveryManJPanel(displayPanel, ecosystem);
        displayPanel.add("DeliveryManJPanel", workArea);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnManageDeliveryManActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageDeliveryMan;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}

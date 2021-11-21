/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class AddOrderJPanel extends javax.swing.JPanel {

    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private ArrayList<MenuItem> menuItems;
    private Restaurant restaurant;
    private UserAccount userAccount;
    private Customer customer;

    /**
     * Creates new form AddOrderJPanel
     */
    public AddOrderJPanel(JPanel displayPanel, EcoSystem ecosystem, UserAccount userAccount, Customer customer) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecoSystem = ecosystem;
        this.userAccount = userAccount;
        this.customer = customer;
        loadData();
    }

    private void loadData() {
        tblCart.removeAll();
        tblMenu.removeAll();
        restaurant = ecoSystem.getRestaurantDirectory().getRestaurantList().get(0);
        for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurantList()) {
            comboRestaurant.addItem(restaurant.getRestaurantName());
        }
        menuItems = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlaceOrder = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        comboRestaurant = new javax.swing.JComboBox<>();
        lblRestaurantName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        lblCart = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });

        btnPlaceOrder.setText("CheckOut");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        lblMsg.setText("Message :");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRestaurantActionPerformed(evt);
            }
        });

        lblRestaurantName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRestaurantName.setText("Select Restaurant ");

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Ingredient", "Price", "Serving Size", "Additional Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Item Quantity", "Price"
            }
        ));
        jScrollPane2.setViewportView(tblCart);

        lblCart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCart.setText("Cart");

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        lblTotal.setText("Total :");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Create Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMsg)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(670, 670, 670))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(comboRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(596, 596, 596)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(643, 643, 643)
                        .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(627, 627, 627)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsg)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed

        UserAccount receiverAccount = null;
        for (UserAccount userAcc : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if (userAcc.getEmployee().getId() == restaurant.getAccountId()) {
                receiverAccount = userAcc;
            }
        }

        DefaultTableModel cartModel = (DefaultTableModel) tblCart.getModel();
        if (cartModel.getRowCount() > 0) {
            Order order = new Order();
            order.setMessage(txtMessage.getText());
            order.setCustomer(customer);
            order.setRestuarant(restaurant);
            order.setCustomerFeedback("");
            order.setDeliveryMan(null);
            order.setDeliveryManFeedback("");
            order.setCustomerFeedback("");
            order.setMenuItems(menuItems);
            order.setReceiver(receiverAccount);
            order.setStatus("Order Placed");

            ecoSystem.getWorkQueue().getWorkRequestList().add(order);
            userAccount.getWorkQueue().getWorkRequestList().add(order);
            receiverAccount.getWorkQueue().getWorkRequestList().add(order);
            JOptionPane.showMessageDialog(null, "Order Placed Successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Nothing In Cart", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel workArea = (CustomerAreaJPanel) component;
        workArea.populateRequestTable();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);

    }//GEN-LAST:event_btnBackActionPerformed

    private void comboRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRestaurantActionPerformed
        // TODO add your handling code here:
        for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurantList()) {

        }
        for (Restaurant rest : ecoSystem.getRestaurantDirectory().getRestaurantList()) {
            if (rest.getRestaurantName().equalsIgnoreCase(comboRestaurant.getItemAt(comboRestaurant.getSelectedIndex()))) {
                restaurant = rest;

                DefaultTableModel menuModel = (DefaultTableModel) tblMenu.getModel();
                menuModel.setRowCount(0);
                txtTotalPrice.setText("");
                DefaultTableModel cartModel = (DefaultTableModel) tblCart.getModel();
                cartModel.setRowCount(0);
                menuItems = new ArrayList<>();
                for (MenuItem menuItem : rest.getMenu().getMenuList()) {

                    Object[] row = new Object[5];
                    row[0] = menuItem;
                    row[1] = menuItem.getIngredients();
                    row[2] = menuItem.getPrice();
                    row[3] = menuItem.getServes();
                    row[4] = menuItem.getAdditionalNote();
                    menuModel.addRow(row);

                }
                break;
            }

        }
        // }

    }//GEN-LAST:event_comboRestaurantActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int quantity = 1;
        boolean isNewItem = true;
        int selectedRow = tblMenu.getSelectedRow();
        MenuItem selectedMenuItem = (MenuItem) tblMenu.getValueAt(selectedRow, 0);
        
        if (selectedRow >= 0) {
            for (MenuItem menuItem : menuItems) {
                quantity = menuItem.getQuantity();
                if (menuItem.getItemName().equalsIgnoreCase(selectedMenuItem.getItemName())) {
                    quantity++;
                    menuItem.setQuantity(quantity);
                    isNewItem = false;
                }
            }
            if (isNewItem) {
                //deep copy
                MenuItem menuItemNew = new MenuItem(selectedMenuItem.getItemName(),selectedMenuItem.getIngredients(),selectedMenuItem.getServes(),selectedMenuItem.getPrice(),selectedMenuItem.getAdditionalNote());
                menuItemNew.setQuantity(quantity);
                menuItems.add(menuItemNew);
            }
            double price = 0;
            DefaultTableModel cartModel = (DefaultTableModel) tblCart.getModel();
            cartModel.setRowCount(0);
            for (MenuItem menuItem : menuItems) {

                Object[] row = new Object[3];
                row[0] = menuItem;
                row[1] = menuItem.getQuantity();
                row[2] = menuItem.getPrice();

                cartModel.addRow(row);
                double itemPrice = menuItem.getQuantity() * menuItem.getPrice();
                price = +itemPrice;

            }
            txtTotalPrice.setText(String.valueOf(price));
            JOptionPane.showMessageDialog(null, "New Item Added", "Entry Added", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> comboRestaurant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}

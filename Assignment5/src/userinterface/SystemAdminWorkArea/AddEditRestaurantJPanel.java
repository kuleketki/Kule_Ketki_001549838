/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class AddEditRestaurantJPanel extends javax.swing.JPanel {

    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    private int operationId;

    /**
     * Creates new form AddEditRestaurantJPanel
     */
    public AddEditRestaurantJPanel(JPanel displayPanel, EcoSystem ecoSystem, Restaurant restaurant, int addEdit) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecoSystem = ecoSystem;
        this.restaurant = restaurant;
        this.operationId = addEdit;
        loadData();
    }

    public void loadData() {
        if (operationId == 1) {
            txtRestaurantName.setText(restaurant.getRestaurantName());
            txtManagerName.setText(restaurant.getManagerName());
            txtAddress.setText(restaurant.getAddress());
            txtTelNo.setText(String.valueOf(restaurant.getPhoneNumber()));
            txtLicenseNo.setText(restaurant.getLicenseNumber());
            txtEmailId.setText(restaurant.getEmailAddress());

            for (UserAccount useraccount : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
                if (useraccount.getEmployee().getId() == restaurant.getAccountId()) {
                    txtPassword.setText(useraccount.getPassword());
                    txtUserName.setText(useraccount.getUsername());
                }
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

        lbltitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblRestaurantName = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtManagerName = new javax.swing.JTextField();
        lblManagerName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        lblMandatoryPass = new javax.swing.JLabel();
        lblMandatoryName = new javax.swing.JLabel();
        lblMandatoryAddress = new javax.swing.JLabel();
        lblMandatoryUserName = new javax.swing.JLabel();
        lblMandatoryTelNo = new javax.swing.JLabel();
        lblMandatoryManagerName = new javax.swing.JLabel();
        lblLicenseNo = new javax.swing.JLabel();
        txtLicenseNo = new javax.swing.JTextField();
        lblMandatoryLicenseNo = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblMandatoryEmailID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(234, 226, 214));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Add Restuarant");

        lblUserName.setText("User Name :");

        lblPassword.setText("Password :");

        lblRestaurantName.setText("Restuarant Name :");

        lblAddress.setText("Address :");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblManagerName.setText("Manager Name :");

        lblTelNo.setText("Phone Number :");

        lblMandatoryPass.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryPass.setText("*");

        lblMandatoryName.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryName.setText("*");

        lblMandatoryAddress.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryAddress.setText("*");

        lblMandatoryUserName.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryUserName.setText("*");

        lblMandatoryTelNo.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryTelNo.setText("*");

        lblMandatoryManagerName.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryManagerName.setText("*");

        lblLicenseNo.setText("License Number :");

        lblMandatoryLicenseNo.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryLicenseNo.setText("*");

        lblEmailId.setText("Email ID :");

        lblMandatoryEmailID.setForeground(new java.awt.Color(255, 51, 51));
        lblMandatoryEmailID.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTelNo)
                                        .addComponent(lblRestaurantName))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(lblManagerName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblUserName)
                                        .addComponent(lblPassword))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUserName)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMandatoryTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMandatoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMandatoryManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMandatoryUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMandatoryPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblLicenseNo)
                                .addComponent(lblAddress))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblMandatoryAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(lblMandatoryLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmailId)
                            .addGap(21, 21, 21)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMandatoryEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName)
                            .addComponent(lblMandatoryUserName))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblPassword))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMandatoryPass)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRestaurantName)
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMandatoryName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelNo)
                            .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMandatoryTelNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManagerName)
                            .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMandatoryManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblLicenseNo))
                            .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblMandatoryLicenseNo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMandatoryAddress)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailId)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMandatoryEmailID))
                        .addGap(45, 45, 45)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String restaurantName = txtRestaurantName.getText();
        String managerName = txtManagerName.getText();
        String address = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String phoneNumber = txtTelNo.getText();
        String licenseNo = txtLicenseNo.getText();
        String emailId = txtEmailId.getText();

        if (txtRestaurantName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtTelNo.getText().isEmpty()
                || txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() || txtManagerName.getText().isEmpty() || txtLicenseNo.getText().isEmpty()
                || txtEmailId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields ", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //validate EMail address
        String emailIdRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        if (!Pattern.matches(emailIdRegex, emailId)) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address ", "Invalid Email ID", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //validate mobileNo
        String telNumberRegex = "\\d{10}";
        if (!Pattern.matches(telNumberRegex, phoneNumber)) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Telephone No ", "Invalid Telephone No", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (operationId == 0) {
            for (UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
                if (account.getUsername().equals(userName)) {
                    JOptionPane.showMessageDialog(null, "User Name Already Exists", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurantList()) {
                if (restaurant.getEmailAddress() != null && restaurant.getEmailAddress().equals(emailId)) {
                    JOptionPane.showMessageDialog(null, "Email Id Already Exists ", "Invalid Email ID", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurantList()) {
                if (restaurant.getPhoneNumber() == Long.parseLong(phoneNumber)) {
                    JOptionPane.showMessageDialog(null, "Phone Number already exists", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(userName);
            ecoSystem.getRestaurantDirectory().getRestaurantList().add(new Restaurant(employee.getId(), licenseNo, restaurantName, emailId, managerName, address, Long.parseLong(phoneNumber)
            ));
            UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "New Restaurant Registered", "Entry Added", JOptionPane.INFORMATION_MESSAGE);
        } else {

            if (restaurant.getPhoneNumber() != Long.parseLong(phoneNumber)) {
                for (Restaurant res : ecoSystem.getRestaurantDirectory().getRestaurantList()) {
                    if (res.getPhoneNumber() == Long.parseLong(phoneNumber) && res.getPhoneNumber() != restaurant.getPhoneNumber()) {
                        JOptionPane.showMessageDialog(null, "Phone Number already exists", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            if (restaurant.getEmailAddress().equals(emailId)) {
                for (Restaurant res : ecoSystem.getRestaurantDirectory().getRestaurantList()) {
                    if (res.getEmailAddress() != null && res.getEmailAddress().equals(emailId) && !res.getEmailAddress().equals(restaurant.getEmailAddress())) {
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address ", "Invalid Email ID", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            //Edit Operation 
            restaurant.setLicenseNumber(licenseNo);
            restaurant.setRestaurantName(restaurantName);
            restaurant.setEmailAddress(emailId);
            restaurant.setManagerName(managerName);
            restaurant.setAddress(address);
            restaurant.setPhoneNumber(Long.parseLong(phoneNumber));

            JOptionPane.showMessageDialog(null, "Restaurant Details Updated", "Entry Updated", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RestaurantJPanel workArea = (RestaurantJPanel) component;
        workArea.loadTableData();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblLicenseNo;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblMandatoryAddress;
    private javax.swing.JLabel lblMandatoryEmailID;
    private javax.swing.JLabel lblMandatoryLicenseNo;
    private javax.swing.JLabel lblMandatoryManagerName;
    private javax.swing.JLabel lblMandatoryName;
    private javax.swing.JLabel lblMandatoryPass;
    private javax.swing.JLabel lblMandatoryTelNo;
    private javax.swing.JLabel lblMandatoryUserName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLicenseNo;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}

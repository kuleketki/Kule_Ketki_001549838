/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.smartcardio.Card;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class AddEditDeliveryManJPanel extends javax.swing.JPanel {

    private JPanel displayPanel;
    private EcoSystem ecoSystem;
    private DeliveryManDirectory deliveryManDirectory;
    private DeliveryMan deliveryMan;
    private int operationId = 0;

    /**
     * Creates new form AddEditDeliveryManJPanel
     */
    public AddEditDeliveryManJPanel(JPanel displayPanel, EcoSystem ecoSystem, DeliveryMan deliveryMan, int addEdit) {
        initComponents();
        this.displayPanel = displayPanel;
        this.ecoSystem = ecoSystem;
        this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
        this.deliveryMan = deliveryMan;
        this.operationId = addEdit;
        loadData();
    }

    private void loadData() {
        //If Update operation is selected
        if (operationId == 1) {
            txtFullName.setText(deliveryMan.getName());
            txtTelNo.setText(String.valueOf(deliveryMan.getTelephoneNo()));
            txtWorkHour.setText(String.valueOf(deliveryMan.getWorkingHoursInWeek()));
            chkbAvail.setSelected(deliveryMan.isAvailable());
            txtEmail.setText(deliveryMan.getEmailAddress());
            txtAddress.setText(deliveryMan.getAddress());

            for (UserAccount userAccount : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
                if (userAccount.getEmployee().getId() == deliveryMan.getEmployeeId()) {
                    txtPassword.setText(userAccount.getPassword());
                    txtUserName.setText(userAccount.getUsername());
                }
            }
            txtUserName.setEditable(false);
            txtPassword.setEditable(false);
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

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        lblWorkHours = new javax.swing.JLabel();
        txtWorkHour = new javax.swing.JTextField();
        lblAvailable = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnSaveDeli = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        chkbAvail = new javax.swing.JCheckBox();
        lblCompulsory = new javax.swing.JLabel();
        lblCompulsory1 = new javax.swing.JLabel();
        lblCompulsoryAdd = new javax.swing.JLabel();
        lblCompulsoryWrkHrs = new javax.swing.JLabel();
        lblCompulsoryEmail = new javax.swing.JLabel();
        lblCompulsoryTelPh = new javax.swing.JLabel();
        lblCompulsoryFullName = new javax.swing.JLabel();
        lblCompulsoryPassword = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Delivey Man");

        lblName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("User Name :");

        txtUserName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPassword.setText("Password :");

        lblFullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFullName.setText("Full Name :");

        txtFullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblTelNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTelNo.setText("Mobile Number :");

        txtTelNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblWorkHours.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblWorkHours.setText("Work Hours :");

        txtWorkHour.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblAvailable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAvailable.setText("Availability :");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAddress.setText("Address :");

        btnSaveDeli.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSaveDeli.setText("Save");
        btnSaveDeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDeliActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail.setText("Email :");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        chkbAvail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblCompulsory.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsory.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsory.setText("*");

        lblCompulsory1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsory1.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsory1.setText("*");

        lblCompulsoryAdd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsoryAdd.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryAdd.setText("*");

        lblCompulsoryWrkHrs.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsoryWrkHrs.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryWrkHrs.setText("*");

        lblCompulsoryEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsoryEmail.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryEmail.setText("*");

        lblCompulsoryTelPh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsoryTelPh.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryTelPh.setText("*");

        lblCompulsoryFullName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsoryFullName.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryFullName.setText("*");

        lblCompulsoryPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCompulsoryPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryPassword.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblName)
                                .addGap(20, 20, 20)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(lblCompulsory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblPassword)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lblCompulsoryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblFullName)
                                .addGap(18, 18, 18)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lblCompulsoryFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCompulsoryTelPh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblWorkHours)
                                    .addComponent(lblEmail)
                                    .addComponent(lblAvailable)
                                    .addComponent(lblAddress))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(lblCompulsoryEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtWorkHour, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCompulsoryWrkHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkbAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblCompulsory1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCompulsoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(btnSaveDeli, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblName))
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblCompulsory)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblPassword))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblCompulsoryPassword)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblFullName))
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblCompulsoryFullName)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompulsoryTelPh))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblEmail))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCompulsoryEmail)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkHours)
                    .addComponent(txtWorkHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompulsoryWrkHrs))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailable)
                    .addComponent(lblCompulsory1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCompulsoryAdd)))
                .addGap(81, 81, 81)
                .addComponent(btnSaveDeli, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDeliActionPerformed
        // TODO add your handling code here:

        String fullName = txtFullName.getText();
        String emailId = txtEmail.getText();
        String address = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String telNo = txtTelNo.getText();
        int workHours = Integer.parseInt(txtWorkHour.getText());
        boolean isAvailable = chkbAvail.isSelected();

        if (txtEmail.getText().isEmpty() || txtFullName.getText().isEmpty() || txtTelNo.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty()
                || txtAddress.getText().isEmpty() || txtWorkHour.getText().isEmpty()) {
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
        if (!Pattern.matches(telNumberRegex, telNo)) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Telephone No ", "Invalid Telephone No", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (operationId == 0) {

            for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                if (deliveryMan.getEmailAddress() != null && deliveryMan.getEmailAddress().equals(emailId)) {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address ", "Invalid Email ID", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                if (deliveryMan.getTelephoneNo() == Long.parseLong(telNo)) {
                    JOptionPane.showMessageDialog(null, "Phone Number already exists", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            for (UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
                if (account.getUsername().equals(userName)) {
                    JOptionPane.showMessageDialog(null, "User Name Already Exists", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(fullName);
            deliveryManDirectory.getDeliveryManList().add(new DeliveryMan(employee.getId(), fullName, address, emailId, Long.parseLong(telNo), workHours, isAvailable));
            UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new DeliverManRole());
            JOptionPane.showMessageDialog(null, "New Delivery Man Registered", "Entry Added", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Edit Operation 

            if (deliveryMan.getTelephoneNo() != Long.parseLong(telNo)) {
                for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                    if (deliveryMan.getTelephoneNo() == Long.parseLong(telNo) && deliveryMan.getTelephoneNo() != deliveryMan.getTelephoneNo()) {
                        JOptionPane.showMessageDialog(null, "Phone Number already exists", "Invalid Entry", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            if (deliveryMan.getEmailAddress().equals(emailId)) {
                for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManList()) {
                    if (deliveryMan.getEmailAddress() != null && deliveryMan.getEmailAddress().equals(emailId) && !deliveryMan.getEmailAddress().equals(deliveryMan.getTelephoneNo())) {
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address ", "Invalid Email ID", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            deliveryMan.setName(fullName);
            deliveryMan.setAddress(address);
            deliveryMan.setEmailAddress(emailId);
            deliveryMan.setTelephoneNo(Long.parseLong(telNo));
            deliveryMan.setWorkingHoursInWeek(workHours);
            JOptionPane.showMessageDialog(null, "Delivery Man Details Updated", "Entry Updated", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnSaveDeliActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DeliveryManJPanel dmljp = (DeliveryManJPanel) component;
        dmljp.loadTableData();
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveDeli;
    private javax.swing.JCheckBox chkbAvail;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblCompulsory;
    private javax.swing.JLabel lblCompulsory1;
    private javax.swing.JLabel lblCompulsoryAdd;
    private javax.swing.JLabel lblCompulsoryEmail;
    private javax.swing.JLabel lblCompulsoryFullName;
    private javax.swing.JLabel lblCompulsoryPassword;
    private javax.swing.JLabel lblCompulsoryTelPh;
    private javax.swing.JLabel lblCompulsoryWrkHrs;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWorkHours;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtWorkHour;
    // End of variables declaration//GEN-END:variables
}
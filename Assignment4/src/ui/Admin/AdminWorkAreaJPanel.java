/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Admin;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.MainJFrame;
import model.System;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel displayPanel;
    System system;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel displayPanel, System system) {
        initComponents();
        this.displayPanel = displayPanel;
        this.system = system;
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
        btnBack = new javax.swing.JButton();
        btnHousePortal = new javax.swing.JButton();
        btnAdminPortal = new javax.swing.JButton();

        setBackground(new java.awt.Color(134, 118, 102));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 195, 170), 2, true));
        setForeground(new java.awt.Color(213, 195, 170));

        lblTitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Admin Login");

        btnBack.setBackground(new java.awt.Color(234, 226, 214));
        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(134, 118, 102));
        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setContentAreaFilled(false);
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHousePortal.setBackground(new java.awt.Color(234, 226, 214));
        btnHousePortal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnHousePortal.setForeground(new java.awt.Color(134, 118, 102));
        btnHousePortal.setText("Add/Edit House Details");
        btnHousePortal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHousePortal.setContentAreaFilled(false);
        btnHousePortal.setOpaque(true);
        btnHousePortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHousePortalActionPerformed(evt);
            }
        });

        btnAdminPortal.setBackground(new java.awt.Color(234, 226, 214));
        btnAdminPortal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdminPortal.setForeground(new java.awt.Color(134, 118, 102));
        btnAdminPortal.setText("Add/Edit Person Details");
        btnAdminPortal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminPortal.setContentAreaFilled(false);
        btnAdminPortal.setOpaque(true);
        btnAdminPortal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPortalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(486, 486, 486))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHousePortal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(701, Short.MAX_VALUE)
                    .addComponent(btnAdminPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139)
                .addComponent(btnHousePortal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(btnAdminPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.last(displayPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHousePortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHousePortalActionPerformed
        // TODO add your handling code here:
        ManageCityHousePanel ms = new ManageCityHousePanel(displayPanel, system);
        displayPanel.add(ms);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnHousePortalActionPerformed

    private void btnAdminPortalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPortalActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel ms = new ManagePersonJPanel(displayPanel, system);
        displayPanel.add(ms);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnAdminPortalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminPortal;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHousePortal;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

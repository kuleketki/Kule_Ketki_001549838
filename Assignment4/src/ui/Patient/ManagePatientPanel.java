/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import ui.Admin.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Patient;
import model.System;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class ManagePatientPanel extends javax.swing.JPanel {

    JPanel displayPanel;
    System system;

    /**
     * Creates new form ManageCityHousePanel
     */
    public ManagePatientPanel(JPanel displayPanel, System system) {
        initComponents();
        this.displayPanel = displayPanel;
        this.system = system;
        refreshTable();
    }

    public void refreshTable() {
        int rowCount = patientTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if (system.getPatientDirectory().getPatientsList().size() > 0) {
            for (Patient s : system.getPatientDirectory().getPatientsList()) {
                Object row[] = new Object[3];
                row[0] = s.getPerson().getFullName();
                row[1] = s.getPerson().getPersonalIdNo();
                if (s.getEncounterHistory().getEncounters().size() > 0) {
                    row[2] = s.getEncounterHistory().getEncounters().get(s.getEncounterHistory().getEncounters().size() - 1).getVitalSigns().getBloodPressure(); //get Latest record
                } else {
                    row[2] = "No Encounters";
                }
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

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        btnAddPatient = new javax.swing.JButton();

        setBackground(new java.awt.Color(134, 118, 102));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(134, 118, 102), 2, true));

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

        lblTitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Patient List");

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Tel No", "Patient BP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(patientTable);

        btnAddPatient.setBackground(new java.awt.Color(234, 226, 214));
        btnAddPatient.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddPatient.setForeground(new java.awt.Color(134, 118, 102));
        btnAddPatient.setText("Add Patient");
        btnAddPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPatient.setContentAreaFilled(false);
        btnAddPatient.setOpaque(true);
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addGap(473, 473, 473))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(718, 718, 718)
                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void backAction() {
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        java.lang.System.out.println("component Array " + componentArray.length);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.last(displayPanel);
    }

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        AddEditPatientPanel add = new AddEditPatientPanel(displayPanel, system);
        displayPanel.add(add);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnAddPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}

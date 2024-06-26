/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Admin;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.System;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class ManageCityHousePanel extends javax.swing.JPanel {

    JPanel displayPanel;
    System system;

    /**
     * Creates new form ManageCityHousePanel
     */
    public ManageCityHousePanel(JPanel displayPanel, System system) {
        initComponents();
        this.displayPanel = displayPanel;
        this.system = system;
        refreshTable();
    }

    public void refreshTable() {
        int rowCount = houseTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (City s : system.getCityDirectory().getCityList()) {
            Object row[] = new Object[2];
            row[0] = s.getCityName();
            row[1] = s.getStateName();
            model.addRow(row);
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
        houseTable = new javax.swing.JTable();
        btnAddCity = new javax.swing.JButton();
        btnAddCommunity = new javax.swing.JButton();

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
        lblTitle.setText("City List");

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "No of Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(houseTable);

        btnAddCity.setBackground(new java.awt.Color(234, 226, 214));
        btnAddCity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddCity.setForeground(new java.awt.Color(134, 118, 102));
        btnAddCity.setText("Add City");
        btnAddCity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddCity.setContentAreaFilled(false);
        btnAddCity.setOpaque(true);
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });

        btnAddCommunity.setBackground(new java.awt.Color(234, 226, 214));
        btnAddCommunity.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddCommunity.setForeground(new java.awt.Color(134, 118, 102));
        btnAddCommunity.setText("Add Community");
        btnAddCommunity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddCommunity.setContentAreaFilled(false);
        btnAddCommunity.setOpaque(true);
        btnAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityActionPerformed(evt);
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
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(473, 473, 473))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310)
                        .addComponent(btnAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(463, 463, 463))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(307, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void backAction() {
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.last(displayPanel);
    }

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        // TODO add your handling code here:
        AddCityCommunityPanel add = new AddCityCommunityPanel(displayPanel, system, 0);
        displayPanel.add(add);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnAddCityActionPerformed

    private void btnAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityActionPerformed
        // TODO add your handling code here:
        if (system.getCityDirectory().getCityList().size() > 0) {
            AddCityCommunityPanel add = new AddCityCommunityPanel(displayPanel, system, 1);
            displayPanel.add(add);
            CardLayout layout = (CardLayout) displayPanel.getLayout();
            layout.next(displayPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please Add City Data ", "City List Empty", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnAddCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnAddCommunity;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable houseTable;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

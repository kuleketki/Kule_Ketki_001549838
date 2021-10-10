/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Search;

import java.awt.CardLayout;
import java.awt.Component;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Car;
import model.Driver;
import model.Uber;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class SearchCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchCarJPanel
     */
    JPanel displayPanel;
    Uber uber;
    int queryNumber;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    ArrayList<String> searchedManufacturers = new ArrayList<>();
    int manufacturingYear;
    int minSeats, maxSeats;
    String serialNumber, modelNumber, cityName;

    public SearchCarJPanel(JPanel displayPanel, Uber uber, int searchNumber) {
        initComponents();
        this.displayPanel = displayPanel;
        this.uber = uber;
        this.queryNumber = searchNumber;
        refreshTable();

    }

    public void updateManufacturersSearch(ArrayList<String> searchedList) {
        searchedManufacturers.addAll(searchedList);
        refreshTable();

    }

    public void updateManufacturingYear(int year) {
        manufacturingYear = year;
        refreshTable();
    }

    public void updateSeatsParams(int minSeats, int maxSeats) {
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        refreshTable();

    }

    public void updateSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        refreshTable();

    }

    public void updateModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
        refreshTable();

    }

    public void updateCity(String city) {
        this.cityName = city;
        refreshTable();

    }

    public void refreshTable() {
        try {
            int rowCount = tableResult.getRowCount();
            DefaultTableModel model = (DefaultTableModel) tableResult.getModel();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            switch (queryNumber) {
                case 0: //Find me the first available passenger car
                    textAreaMsg.setVisible(false);
                    for (Driver s : uber.getDriverDirectory().getDriverList()) {
                        if (s.isAvailable()) {
                            Object row[] = new Object[7];
                            row[0] = s.getSerialNumber();
                            row[1] = s.getCar().getModelNumber();
                            row[2] = s.getCar().getManufacturer();
                            row[3] = s.getCar().getManufacturingYear();
                            row[4] = s.getCar().getSeats();
                            row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                            row[6] = s.isAvailable();
                            model.addRow(row);
                            break;
                        }
                    }
                    break;
                case 1: //How many cars are currently available. How many are not
                    ArrayList<Driver> availCars = new ArrayList<>();
                    int availableCars = 0,
                     unavailableCars = 0;
                    for (Driver driver : uber.getDriverDirectory().getDriverList()) {
                        if (driver.isAvailable()) {
                            availCars.add(driver);
                            ++availableCars;
                        } else {
                            ++unavailableCars;
                        }
                    }

                    for (Driver s : availCars) {
                        Object row[] = new Object[7];
                        row[0] = s.getSerialNumber();
                        row[1] = s.getCar().getModelNumber();
                        row[2] = s.getCar().getManufacturer();
                        row[3] = s.getCar().getManufacturingYear();
                        row[4] = s.getCar().getSeats();
                        row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                        row[6] = s.isAvailable();
                        model.addRow(row);
                    }
                    StringBuilder strBuilder = new StringBuilder();
                    strBuilder.append("Available Cars :    " + availableCars);
                    strBuilder.append(System.getProperty("line.separator"));
                    strBuilder.append("Unavailable Cars:   " + unavailableCars);
                    textAreaMsg.setText(strBuilder.toString());
                    break;
                case 2: //List all cars that are made by specific manufacturers
                    textAreaMsg.setVisible(false);
                    ArrayList<Driver> carsList = new ArrayList<>();

                    for (Driver driver : uber.getDriverDirectory().getDriverList()) {
                        for (String manufacturer : searchedManufacturers) {
                            if (manufacturer.equalsIgnoreCase(driver.getCar().getManufacturer())) {
                                carsList.add(driver);
                            }
                        }

                    }

                    for (Driver s : carsList) {
                        Object row[] = new Object[7];
                        row[0] = s.getSerialNumber();
                        row[1] = s.getCar().getModelNumber();
                        row[2] = s.getCar().getManufacturer();
                        row[3] = s.getCar().getManufacturingYear();
                        row[4] = s.getCar().getSeats();
                        row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                        row[6] = s.isAvailable();
                        model.addRow(row);
                    }
                    break;
                case 3://List all cars that were manufactured in a specific year
                    textAreaMsg.setText("Manufacturing Year: " + manufacturingYear);
                    ArrayList<Driver> carsManufaturedInYear = new ArrayList<>();
                    for (Driver driver : uber.getDriverDirectory().getDriverList()) {
                        if (driver.getCar().getManufacturingYear() == manufacturingYear) {
                            carsManufaturedInYear.add(driver);
                        }
                    }

                    for (Driver s : carsManufaturedInYear) {
                        Object row[] = new Object[7];
                        row[0] = s.getSerialNumber();
                        row[1] = s.getCar().getModelNumber();
                        row[2] = s.getCar().getManufacturer();
                        row[3] = s.getCar().getManufacturingYear();
                        row[4] = s.getCar().getSeats();
                        row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                        row[6] = s.isAvailable();
                        model.addRow(row);
                    }

                    break;
                case 4: //List all cars with a minimum of x seats but no more than y seats
                    textAreaMsg.setText("Minimum seats : " + minSeats + "\n" + "Maximum seats: " + maxSeats);
                    for (Driver s : uber.getDriverDirectory().getDriverList()) {
                        int seats = s.getCar().getSeats();
                        if (seats >= minSeats && seats <= maxSeats) {
                            Object row[] = new Object[7];
                            row[0] = s.getSerialNumber();
                            row[1] = s.getCar().getModelNumber();
                            row[2] = s.getCar().getManufacturer();
                            row[3] = s.getCar().getManufacturingYear();
                            row[4] = s.getCar().getSeats();
                            row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                            row[6] = s.isAvailable();
                            model.addRow(row);
                        }
                    }
                    break;
                case 5: //Find a car with the given serial number
                    textAreaMsg.setText("serial number: " + serialNumber);
                    for (Driver s : uber.getDriverDirectory().getDriverList()) {
                        if (s.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                            Object row[] = new Object[7];
                            row[0] = s.getSerialNumber();
                            row[1] = s.getCar().getModelNumber();
                            row[2] = s.getCar().getManufacturer();
                            row[3] = s.getCar().getManufacturingYear();
                            row[4] = s.getCar().getSeats();
                            row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                            row[6] = s.isAvailable();
                            model.addRow(row);
                        }
                    }
                    break;
                case 6: //List all cars given the model number 
                    textAreaMsg.setText("Model Number: " + modelNumber);
                    for (Driver s : uber.getDriverDirectory().getDriverList()) {
                        if (s.getCar().getModelNumber().equalsIgnoreCase(modelNumber)) {
                            Object row[] = new Object[7];
                            row[0] = s.getSerialNumber();
                            row[1] = s.getCar().getModelNumber();
                            row[2] = s.getCar().getManufacturer();
                            row[3] = s.getCar().getManufacturingYear();
                            row[4] = s.getCar().getSeats();
                            row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                            row[6] = s.isAvailable();
                            model.addRow(row);

                        }
                    }
                    if (tableResult.getRowCount() <= 0) {
                        Object row[] = new Object[1];
                        row[0] = "No Results To Display";
                    }
                    break;
                case 7://List all the car manufacturers used by the (this) Uber 

                    TableModel newModel = new DefaultTableModel(
                            new Object[][]{},
                            new String[]{"Manufacturer"});

                    tableResult.setModel(newModel);
                    ((AbstractTableModel) newModel).fireTableDataChanged();
                    model = (DefaultTableModel) tableResult.getModel();
                    textAreaMsg.setVisible(false);
                    ArrayList<String> listManufacturers = new ArrayList<>();
                    for (Car car : uber.getCarDirectory().getCarList()) {
                        if (!listManufacturers.contains(car.getManufacturer())) {
                            listManufacturers.add(car.getManufacturer());
                            Object row[] = new Object[1];
                            row[0] = car.getManufacturer();
                            model.addRow(row);
                        }
                    }
                    break;
                case 8://When was the last time the fleet catalog was updated 
                    break;
                case 9: //List all cars that are available in a given city 
                    textAreaMsg.setText("City : " + cityName);
                    for (Driver s : uber.getDriverDirectory().getDriverList()) {
                        if (s.getCity().equalsIgnoreCase(cityName)) {
                            Object row[] = new Object[7];
                            row[0] = s.getSerialNumber();
                            row[1] = s.getCar().getModelNumber();
                            row[2] = s.getCar().getManufacturer();
                            row[3] = s.getCar().getManufacturingYear();
                            row[4] = s.getCar().getSeats();
                            row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                            row[6] = s.isAvailable();
                            model.addRow(row);
                        }

                    }
                    break;
                case 10: //List all cars that have expired maintenance certificate 
                    textAreaMsg.setVisible(false);
                    for (Driver s : uber.getDriverDirectory().getDriverList()) {
                        Date date = Date.from(s.getCar().getMaintenanceCertExpiry().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
                        if (date.getTime() < Calendar.getInstance().getTimeInMillis()) {
                            Object row[] = new Object[7];
                            row[0] = s.getSerialNumber();
                            row[1] = s.getCar().getModelNumber();
                            row[2] = s.getCar().getManufacturer();
                            row[3] = s.getCar().getManufacturingYear();
                            row[4] = s.getCar().getSeats();
                            row[5] = s.getCar().getMaintenanceCertExpiry().format(formatter);
                            row[6] = s.isAvailable();
                            model.addRow(row);
                        }
                    }
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResult = new javax.swing.JTable();
        textAreaMsg = new java.awt.TextArea();
        jButton1 = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search Result");

        tableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial Number", "Model Number", "Manufacturer", "Manufacturing Year", "No. of seats", "Maintenance Certificate", "Availability"
            }
        ));
        jScrollPane1.setViewportView(tableResult);

        textAreaMsg.setEditable(false);

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367)
                        .addComponent(lblTitle))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAreaMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(textAreaMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backAction() {
        displayPanel.remove(this);
        Component[] componentArray = displayPanel.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.previous(displayPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableResult;
    private java.awt.TextArea textAreaMsg;
    // End of variables declaration//GEN-END:variables
}

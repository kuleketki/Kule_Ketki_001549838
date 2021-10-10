/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class Car {

    private String serialNumber;
    private String modelNumber;
    private String manufacturer;
    private int manufacturingYear;
    private int seats;
    private LocalDate maintenanceCertExpiry;

    public Car() {

    }

    public Car(String serialNumber, String modelNumber, String manufacturer, int manufacturingYear, int seats, LocalDate date) {
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.seats = seats;
        this.maintenanceCertExpiry = date;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public LocalDate getMaintenanceCertExpiry() {
        return maintenanceCertExpiry;
    }

    public void setMaintenanceCertExpiry(LocalDate maintenanceCertExpiry) {
        this.maintenanceCertExpiry = maintenanceCertExpiry;
    }

}

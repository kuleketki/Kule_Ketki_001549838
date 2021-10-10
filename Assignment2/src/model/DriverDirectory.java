/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class DriverDirectory {

    private ArrayList<Driver> driverList;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DriverDirectory() {
        driverList = new ArrayList<>();
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public void addDriver(Driver driver) {
        driverList.add(driver);
    }

    public void removeDriver(Driver driver) {
        driverList.remove(driver);
    }
}

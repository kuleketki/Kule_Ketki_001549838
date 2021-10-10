/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class Uber {

    private DriverDirectory driverDirectory;
    private CarDirectory carDirectory;

    public Uber() {
        driverDirectory = new DriverDirectory();
        carDirectory = new CarDirectory();
    }

    public DriverDirectory getDriverDirectory() {
        return driverDirectory;
    }

    public void setDriverDirectory(DriverDirectory driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public CarDirectory getCarDirectory() {
        return carDirectory;
    }

    public void setCarDirectory(CarDirectory carDirectory) {
        this.carDirectory = carDirectory;
    }

}

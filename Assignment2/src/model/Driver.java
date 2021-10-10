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
public class Driver {

    private Car car;
    private String city;
    private boolean isAvailable;
    private String serialNumber;
    
    public Driver(){
        
    }
    
    public Driver(Car car, String city, boolean isAvailable, String serialNumber) {
        this.car = car;
        this.city = city;
        this.isAvailable = isAvailable;
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    @Override
    public String toString() {
        return serialNumber; //To change body of generated methods, choose Tools | Templates.
    }

}

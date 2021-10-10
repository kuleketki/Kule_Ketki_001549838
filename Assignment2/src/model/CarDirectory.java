/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class CarDirectory {

    private ArrayList<Car> carList;

    public CarDirectory() {
        carList = new ArrayList<>();
    }

     public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public void addCar(Car car) {
        carList.add(car);
    }
    
    public void removeCar(Car car) {
        carList.remove(car);
    }
        
}

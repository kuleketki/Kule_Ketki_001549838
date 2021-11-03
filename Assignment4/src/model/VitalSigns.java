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
public class VitalSigns {

    private int bodyTemp;
    private int pulseRate;
    private int respirationRate;
    private int systolicPressure;
    private int diastolicPressure;
    private float weight;
    private float height;

    public VitalSigns(int bodyTemp, int pulseRate, int respirationRate, int systolicPressure, int diastolicPressure, float weight, float height) {
        this.bodyTemp = bodyTemp;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.weight = weight;
        this.height = height;
    }

    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBloodPressure() {
        return this.systolicPressure + "/" + this.diastolicPressure;
    }

}

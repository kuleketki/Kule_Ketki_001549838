/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class Person {
    
    private String name;
    private String street;
    private String city;
    private String country;
    private String pincode;
    private LocalDate birthDate;
    private long mobileNumber;
    private long faxNumber;
    private String emailAddr;
    private String socialSecurityNum; //9 digits
    private int medicalRecordNum; //6 digits
    private String healthPlanNum;
    private String bankAccNum;
    private String certificateNum;
    private String vehicleIdentifiers;
    private String deviceIdentifiers;
    private String linkedInId;
    private String ipAddr;
    private String biometricIdentifier;
    private String photographicImg;
    private String uniqueNum;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    public int getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(int medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getHealthPlanNum() {
        return healthPlanNum;
    }

    public void setHealthPlanNum(String healthPlanNum) {
        this.healthPlanNum = healthPlanNum;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    public String getVehicleIdentifiers() {
        return vehicleIdentifiers;
    }

    public void setVehicleIdentifiers(String vehicleIdentifiers) {
        this.vehicleIdentifiers = vehicleIdentifiers;
    }

    public String getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public void setDeviceIdentifiers(String deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getBiometricIdentifier() {
        return biometricIdentifier;
    }

    public void setBiometricIdentifier(String biometricIdentifier) {
        this.biometricIdentifier = biometricIdentifier;
    }

    public String getPhotographicImg() {
        return photographicImg;
    }

    public void setPhotographicImg(String photographicImg) {
        this.photographicImg = photographicImg;
    }

    public String getUniqueNum() {
        return uniqueNum;
    }

    public void setUniqueNum(String uniqueNum) {
        this.uniqueNum = uniqueNum;
    }
   
    
}

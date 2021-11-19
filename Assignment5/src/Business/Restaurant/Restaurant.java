/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */
public class Restaurant {

    private String licenseNumber;
    private String restaurantName;
    private String emailAddress;
    private String managerName;
    private String address;
    private Menu menu;
    private long telPhoneNo;
    private int accountId;

    public Restaurant(int accountId, String licenseNo, String name, String emailAddress, String managerName, String address, long phone) {
        this.accountId = accountId;
        this.restaurantName = name;
        this.emailAddress = emailAddress;
        this.managerName = managerName;
        this.address = address;
        this.menu = new Menu(licenseNumber);
        this.licenseNumber = licenseNumber;
        this.telPhoneNo = phone;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public long getPhoneNumber() {
        return telPhoneNo;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.telPhoneNo = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String name) {
        this.restaurantName = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String name) {
        this.managerName = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public long getTelPhoneNo() {
        return telPhoneNo;
    }

    public void setTelPhoneNo(long telPhoneNo) {
        this.telPhoneNo = telPhoneNo;
    }

    @Override
    public String toString() {
        return restaurantName;
    }

}

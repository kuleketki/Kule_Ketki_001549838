/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryMan {

    private String name;
    private String address;
    private String emailAddress;
    private long telephoneNo;
    private boolean isAvailable;
    private int workingHoursInWeek;
    private int employeeId;

    public DeliveryMan(int employeeId, String name, String address, String emailAddress, long telephoneNo, int workingHours, boolean isAvailable) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.telephoneNo = telephoneNo;
        this.workingHoursInWeek = workingHours;
        this.isAvailable = isAvailable;
    }

    public int getWorkingHoursInWeek() {
        return workingHoursInWeek;
    }

    public void setWorkingHoursInWeek(int workingHoursInWeek) {
        this.workingHoursInWeek = workingHoursInWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(long telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return name;
    }

}

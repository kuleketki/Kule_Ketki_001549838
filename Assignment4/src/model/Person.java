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
public class Person {

    private int personId;
    private String firstName;
    private String lastName;
    private int age;
    private long telephoneNo;
    private String personalIdNo;
    private String bloodGroup;
    private House house;

    public Person(int personId, String firstName, String lastName, int age, long telephoneNo, String personalIdNo, String bloodGroup, House house) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.telephoneNo = telephoneNo;
        this.personalIdNo = personalIdNo;
        this.bloodGroup = bloodGroup;
        this.house = house;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(long telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getPersonalIdNo() {
        return personalIdNo;
    }

    public void setPersonalIdNo(String personalIdNo) {
        this.personalIdNo = personalIdNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

}

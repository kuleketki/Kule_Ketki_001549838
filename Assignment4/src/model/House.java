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
public class House {

    private int aptNo;
    private int noOfResidents;
    private String address;
    private int communityId;
    private int cityId;
    private String zipCode;

    public House(int aptNo, int residentsCount, String address, String zipCode, int communityID, int cityId) {
        this.aptNo = aptNo;
        this.noOfResidents = residentsCount;
        this.address = address;
        this.zipCode = zipCode;
        this.communityId = communityID;
        this.cityId = cityId;
    }

    public int getAptNo() {
        return aptNo;
    }

    public void setAptNo(int aptNo) {
        this.aptNo = aptNo;
    }

    public int getNoOfResidents() {
        return noOfResidents;
    }

    public void setNoOfResidents(int noOfResidents) {
        this.noOfResidents = noOfResidents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}

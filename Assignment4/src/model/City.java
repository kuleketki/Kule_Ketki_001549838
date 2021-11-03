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
public class City {

    private int cityId;
    private String name;
    private String stateName;
    private ArrayList<Community> communityList;

    public City(int id, String name, String stateName) {
        communityList = new ArrayList<>();
        cityId = id;
        this.name = name;
        this.stateName = stateName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

}

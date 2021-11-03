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
public class Community {

    private int communityId;
    private String name;
    private ArrayList<House> houseList;

    public Community(int id, String communityName) {
        this.communityId = id;
        this.name = communityName;
        houseList = new ArrayList<>();
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

}

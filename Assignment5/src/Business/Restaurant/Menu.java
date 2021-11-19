/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class Menu {

    private ArrayList<MenuItem> menuList;
    private String licenseNo;

    public Menu(String restaurantLicenseNo) {
        menuList = new ArrayList<>();
        this.licenseNo = restaurantLicenseNo;

    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

}

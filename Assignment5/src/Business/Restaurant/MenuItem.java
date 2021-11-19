/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Ketki Kule <kule.k@northeastern.edu>
 */
public class MenuItem {

    private String itemName;
    private String ingredients;
    private double price;
    private int serves;

    public MenuItem(String itemName, String ingredient, int serves, double price) {
        this.itemName = itemName;
        this.ingredients = ingredient;
        this.price = price;
        this.serves = serves;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getServes() {
        return serves;
    }

    public void setServes(int serves) {
        this.serves = serves;
    }

    @Override
    public String toString() {
        return itemName;
    }
}

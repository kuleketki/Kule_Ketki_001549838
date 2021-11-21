/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private DeliveryMan deliveryMan;
    private Customer customer;
    private Restaurant restuarant;
    private String restaurantFeedback;
    private String customerFeedback;
    private String deliveryManFeedback;
    private ArrayList<MenuItem> menuItems;

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestuarant() {
        return restuarant;
    }

    public void setRestuarant(Restaurant restuarant) {
        this.restuarant = restuarant;
    }

    public String getRestaurantFeedback() {
        return restaurantFeedback;
    }

    public void setRestaurantFeedback(String restaurantFeedback) {
        this.restaurantFeedback = restaurantFeedback;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    public String getDeliveryManFeedback() {
        return deliveryManFeedback;
    }

    public void setDeliveryManFeedback(String deliveryManFeedback) {
        this.deliveryManFeedback = deliveryManFeedback;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return this.receiver.getUsername();
    }
    
    
}

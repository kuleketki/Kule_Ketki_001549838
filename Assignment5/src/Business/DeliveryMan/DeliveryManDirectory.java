/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
    deliveryManList = new ArrayList<>();
    }    
    
    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    
    
}

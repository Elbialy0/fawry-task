package service;

import model.Shipping;
import model.ShippingItem;

import java.util.ArrayList;
import java.util.List;

public class ShippingService {
    List<ShippingItem> shippingItems;
    private double totalWeight;
    public ShippingService() {
        shippingItems = new ArrayList<>();
    }

    public List<ShippingItem> getShippingItems() {
        return shippingItems;
    }

    public void setShippingItems(List<ShippingItem> shippingItems) {
        this.shippingItems = shippingItems;
    }
    public void  printShippingItems() {
        System.out.println("** Shipment notice **");
         totalWeight = 0;
        for (ShippingItem shippingItem : shippingItems) {
            totalWeight += shippingItem.getWeight()*shippingItem.getQuantity();
            System.out.println(shippingItem.getQuantity()+"x "+shippingItem.getName()
                    +"   "+(shippingItem.getQuantity()*shippingItem.getWeight()));
        }
        System.out.println("Total package weight: "+ totalWeight);
        System.out.println();
    }

    public double getShippingCost() {
        return totalWeight*3;
    }
}

package model;

import java.util.List;

public class Cart {
    private List<Order> orders;
    private double shippingCost = 0;
    private double orderCost = 0;


    public Cart() {}

    public Cart(List<Order> orders) {
        this.orders = orders;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }
    public double getShippingCost() {
        for (Order order : orders) {
            if(order.getShipping()){
                shippingCost+=order.getShippingCost();
            }
        }
        return shippingCost;
    }

    public double getOrderCost() {
        for (Order order : orders) {
            orderCost+=order.getPrice();
        }
        return orderCost;
    }

}

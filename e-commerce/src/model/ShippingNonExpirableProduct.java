package model;

import java.io.Serializable;

public class ShippingNonExpirableProduct extends BaseProduct implements Shipping{
    private double weight;


    public ShippingNonExpirableProduct(double weight) {
        this.weight = weight;
    }

    public ShippingNonExpirableProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

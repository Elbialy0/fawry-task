package model;

import java.time.LocalDate;

public class ShippingExpirable extends BaseProduct implements Shipping, Expirable{
    private LocalDate expirationDate;
    private double weight;
    @Override
    public LocalDate getExpiryDate() {
        return expirationDate;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public ShippingExpirable(int quantity, double price, String name, LocalDate expirationDate, double weight) {
        super(quantity, price, name);
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public boolean shipping(){
        return true;
    }
    @Override
    public boolean expirable(){
        return true;
    }
}

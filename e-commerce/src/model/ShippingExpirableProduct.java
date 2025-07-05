package model;

import java.time.LocalDate;

public class ShippingExpirableProduct extends BaseProduct implements Shipping ,Expirable{

    private LocalDate expiryDate;
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

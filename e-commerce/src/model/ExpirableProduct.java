package model;

import java.time.LocalDate;

public class ExpirableProduct extends BaseProduct implements Expirable{
    private LocalDate expiryDate;

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public ExpirableProduct(int quantity, double price, String name, LocalDate expiryDate) {
        super(quantity, price, name);
        this.expiryDate = expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}

package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExpirableProduct extends BaseProduct implements Expirable{
    private LocalDate expiryDate;


    public ExpirableProduct(LocalDate expiryDate) {
        super();
        this.expiryDate = expiryDate;
    }

    public ExpirableProduct(String name, double price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}

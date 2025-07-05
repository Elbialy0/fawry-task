package model;

public class BaseProduct implements Product {
    private int quantity;
    private double price;
    private String name;

    public BaseProduct(int quantity, double price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public BaseProduct() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {

        this.price = price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    @Override
    public boolean shipping() {
        return false;
    }

    @Override
    public boolean expirable() {
        return false;
    }
}

package model;

public class ShippingItem implements Shipping {
    private int quantity;
    private String name;
    private double weight;


    @Override
    public String getName() {
        return name ;
    }

    public ShippingItem(int quantity, String name, double weight) {
        this.quantity = quantity;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

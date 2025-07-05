package model;

public class ShippingNonExpirable extends BaseProduct implements Shipping{

    private double weight;
    @Override
    public double getWeight() {
        return weight;
    }

    public ShippingNonExpirable(int quantity, double price, String name, double weight) {
        super(quantity, price, name);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public boolean shipping(){
        return true;
    }
}

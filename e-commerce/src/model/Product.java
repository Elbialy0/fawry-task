package model;

public interface Product {
    public String getName();
    public void setName(String name);
    public double getPrice();
    public void setPrice(double price);
    public int getQuantity();
    public void setQuantity(int quantity);
    public boolean shipping();
    public boolean expirable();
}

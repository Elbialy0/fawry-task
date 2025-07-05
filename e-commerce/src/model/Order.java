package model;

public class Order {
    private int id;
    private BaseProduct product;
    private Boolean shipping;
    private int quantity;
    private double price;
    private double shippingCost;

    public Order(){

    }
    public Order(int id, BaseProduct product, Boolean shipping, int quantity,double shippingCost) {
        this.id = id;
        this.product = product;
        this.shipping = shipping;
        this.quantity = quantity;
        this.price = product.getPrice()*quantity;
        this.shippingCost = shippingCost;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseProduct getProduct() {
        return product;
    }

    public void setProduct(BaseProduct product) {
        this.product = product;
    }

    public Boolean getShipping() {
        return shipping;
    }

    public void setShipping(Boolean shipping) {
        this.shipping = shipping;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = product.getPrice()*quantity;
    }


}

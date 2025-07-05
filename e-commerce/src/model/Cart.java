package model;

import service.ShippingService;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double price;
    private List<CartItem> products;
    private ShippingService shippingService = new ShippingService();
    public Cart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity){
        if(product.getQuantity() < quantity){
            System.out.println("Not enough products in stock");
            return;
        }
        price += product.getPrice() * quantity;
        products.add(new CartItem(product, quantity));
    }

    public void checkout(){
        if(products.isEmpty()){
            System.out.println("Cart is empty");
            return;
        }
        List<ShippingItem>shippingList = new ArrayList<>();
        for (CartItem item : products){
            if(item.getProduct().shipping()){
                Shipping shippingProduct = (Shipping) item.getProduct();
                shippingList.add(new ShippingItem(item.getQuantity(),shippingProduct.getName(),shippingProduct.getWeight()));}
            shippingService.setShippingItems(shippingList);
        }
        shippingService.printShippingItems();
        for (CartItem item : products){
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName()
                    +"     "+item.getProduct().getPrice()*item.getQuantity());
            price += item.getProduct().getPrice()*item.getQuantity();
        }
        System.out.println("---------------------------------");
        System.out.println("Subtotal: "+price);
        System.out.println("Shipping: "+shippingService.getShippingCost());
        System.out.println("Amount  : "+(price+shippingService.getShippingCost()));
    }


}

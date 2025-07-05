import model.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Product cheese = new ShippingExpirable(20 , 100 , "Cheese", LocalDate.now(),200 );
        Product tv = new ShippingNonExpirable(5 , 5 , "TV",400);
        Product water = new BaseProduct(2 , 5 , "Water");
        Product cake = new ExpirableProduct(5,5,"Cake",LocalDate.now());

        Cart cart = new Cart();
        Customer customer = new Customer("Elbialy", 500222220);
        cart.setCustomer(customer);
        cart.addProduct(cheese,3);
        cart.addProduct(tv,2);
        cart.addProduct(water,1);
        cart.addProduct(cake,1);
        cart.checkout();

    }
}
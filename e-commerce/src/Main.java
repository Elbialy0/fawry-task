import model.BaseProduct;
import model.Cart;
import model.Product;
import model.ShippingNonExpirable;


public class Main {
    public static void main(String[] args) {
        Product game = new BaseProduct(5, 7 ,"game");
        Cart cart = new Cart();
        cart.addProduct(game, 4);

        Product TV = new ShippingNonExpirable(10 , 50 , "TV",150);
        cart.addProduct(TV, 1);
        cart.print();

    }
}
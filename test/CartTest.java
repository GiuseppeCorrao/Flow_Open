import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Cart;
import products.Product;

import java.util.ArrayList;
import java.util.List;


public class CartTest {


    @Test
    void buyTest() {
        Cart cart = new Cart();
        Product computer = new Product(Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);
        Product computer1 = new Product(Brand.HP, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);

        cart.buy(computer);

       Assertions.assertTrue(cart.buy(computer));
    }

    @Test
    void abortTest() {

        Product product = new Product(Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);
        Cart cart = new Cart();

        cart.abort();

    }


    @Test
    void addOnCartTest() {

        Product computer = new Product(Brand.ACER, "dsdkkdsksds", "jjjjd", 3.0, "idskdskdk", "computer", 10);
        Cart cart = new Cart();

        cart.addOnCart(computer);

        Assertions.assertFalse(cart.addOnCart(computer));

    }

    @Test
    void totalPriceTestWithProductOnCart() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "smartphone", 10);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "TV", 34);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "TV", 34);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);

        Assertions.assertEquals(9.0, cart.totalPrice());
    }

    @Test
    void totalPriceWithEmptyCart(){
        Cart cart = new Cart();

        Assertions.assertEquals(0.0,cart.totalPrice());
    }

    @Test
    void priceDeliveryWithPriceOfProductSuperiorTo20() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", "CKDSKSKKS", 300.00, "SKSKK", "smartphone", 10);

        cart.addOnCart(smartphone);

        Assertions.assertEquals(300.00, cart.priceDelivery());

    }

    @Test
    void priceDeliveryWithPriceOfProductInferiorTo20() {
        Cart cart = new Cart();
        Product raspberryPi4 = new Product(Brand.LG, "SJDJDJJSD", "CKDSKSKKS", 6.38, "SKSKK", "TV", 34);

        cart.addOnCart(raspberryPi4);

        Assertions.assertEquals(21.38, cart.priceDelivery());
    }

}

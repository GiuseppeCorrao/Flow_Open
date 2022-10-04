import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Cart;
import products.Product;


public class CartTest {


    @Test
    void buyTest() {
        Cart cart = new Cart();
        Product computer = new Product("pc", "This PC works", Brand.HP, "Black", 329.00, 4);
        Product computer1 = new Product("PC ", "This PC works", Brand.HP, "Black", 329.00, 4);

        cart.addOnCart(computer);
        cart.addOnCart(computer1);
        cart.buy();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());
    }

    @Test
    void abortTest() {
        Product product = new Product("TravelMate P2", "This PC works", Brand.ACER, "pc", 329.00, 4);
        Cart cart = new Cart();

        cart.addOnCart(product);
        cart.abort();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());

    }


    @Test
    void addOnCartTest() {
        Product computer = new Product("is a pc", "dsdkkdsksds", Brand.ACER, "idskdskdk", 368.89, 10);
        Cart cart = new Cart();

        cart.addOnCart(computer);

        Assertions.assertTrue(cart.getProductsOnCart().contains(computer));

    }

    @Test
    void totalPriceTestWithProductOnCart() {
        Cart cart = new Cart();
        Product smartphone = new Product("smartphone", "SJDJDJJSD", Brand.ACER, "SKSKK", 3.0, 10);
        Product tv = new Product("tv", "SJDJDJJSD", Brand.LG, "SKSKK", 3.0, 34);
        Product mouse = new Product("mouse", "SJDJDJJSD", Brand.LG, "SKSKK", 3.0, 34);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);

        Assertions.assertEquals(9.0, cart.totalPrice());
    }

    @Test
    void totalPriceWithEmptyCart() {
        Cart cart = new Cart();

        Assertions.assertEquals(0.0, cart.totalPrice());
    }

    @Test
    void priceDeliveryWithPriceOfProductSuperiorTo100() {
        Cart cart = new Cart();
        Product smartphone = new Product("smartphone", "SJDJDJJSD", Brand.ACER, "SKSKK", 30.89, 10);

        cart.addOnCart(smartphone);

        Assertions.assertEquals(0.0, cart.priceDelivery());

    }

    @Test
    void priceDeliveryWithPriceOfProductInferiorTo100() {
        Cart cart = new Cart();
        Product raspberryPi4 = new Product("jojo", "SJDJDJJSD", Brand.LG, "SKSKK", 6.38, 34);

        cart.addOnCart(raspberryPi4);

        Assertions.assertEquals(15, cart.priceDelivery());
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Cart;
import products.Product;


public class CartTest {


    @Test
    void buyTest() {
        Cart cart = new Cart();
        Product computer = new Product(Brand.ACER, "Black", 329.00, "This PC works", "pc", 4);
        Product computer1 = new Product(Brand.HP, "Black", 329.00, "This PC works", "PC ", 4);

        cart.addOnCart(computer);
        cart.addOnCart(computer1);
        cart.buy();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());
    }

    @Test
    void abortTest() {
        Product product = new Product(Brand.ACER, "TravelMate P2", 329.00, "pc", "This PC works", 4);
        Cart cart = new Cart();

        cart.addOnCart(product);
        cart.abort();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());

    }


    @Test
    void addOnCartTest() {
        Product computer = new Product(Brand.ACER, "dsdkkdsksds", 368.89, "is a pc", "idskdskdk", 10);
        Cart cart = new Cart();

        cart.addOnCart(computer);

        Assertions.assertTrue(cart.getProductsOnCart().contains(computer));

    }

    @Test
    void totalPriceTestWithProductOnCart() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 3.0, "smartphone", "SKSKK", 10);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", 3.0, "tv", "SKSKK", 34);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);

        Assertions.assertEquals(54.0, cart.totalPrice());
    }

    @Test
    void totalPriceWithEmptyCart() {
        Cart cart = new Cart();

        Assertions.assertEquals(0.0, cart.totalPrice());
    }

    @Test
    void priceDeliveryWithPriceOfProductSuperiorTo100() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 130.89, "smartphone", "SKSKK", 10);

        cart.addOnCart(smartphone);

        Assertions.assertEquals(0.0, cart.priceDelivery());

    }

    @Test
    void priceDeliveryWithPriceOfProductInferiorTo100() {
        Cart cart = new Cart();
        Product raspberryPi4 = new Product(Brand.LG, "SJDJDJJSD", 6.38, "jojo", "SKSKK", 34);

        cart.addOnCart(raspberryPi4);

        Assertions.assertEquals(15, cart.priceDelivery());
    }

    @Test
    void calculateIvaTest() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 3.0, "smartphone", "SKSKK", 10);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", 3.0, "tv", "SKSKK", 34);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);

        Assertions.assertEquals(11.88, cart.calculateIva());
    }
}


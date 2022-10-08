import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Cart;
import products.Product;


public class CartTest {


    @Test
    void buyTest() {
        Cart cart = new Cart();
<<<<<<< HEAD
        Product computer = new Product(Brand.ACER, "Black", 329.00, "This PC works", "pc", 4, 10);
        Product computer1 = new Product(Brand.HP, "Black", 329.00, "This PC works", "PC ", 4, 10);
=======
        Product computer = new Product("pc", "This PC works", Brand.HP, "Black", 329.00, 4);
        Product computer1 = new Product("PC ", "This PC works", Brand.HP, "Black", 329.00, 4);
>>>>>>> bb91a7db9db397823a81d1db06f4b4e138f31a6e

        cart.addOnCart(computer);
        cart.addOnCart(computer1);
        cart.buy();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());
    }

    @Test
    void abortTest() {
<<<<<<< HEAD
        Product product = new Product(Brand.ACER, "TravelMate P2", 329.00, "pc", "This PC works", 4, 8);
=======
        Product product = new Product("TravelMate P2", "This PC works", Brand.ACER, "pc", 329.00, 4);
>>>>>>> bb91a7db9db397823a81d1db06f4b4e138f31a6e
        Cart cart = new Cart();

        cart.addOnCart(product);
        cart.abort();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());

    }


    @Test
    void addOnCartTest() {

        Product computer = new Product(Brand.ACER, "dsdkkdsksds", 368.89, "is a pc", "idskdskdk", 10, 9);
        Product computers = new Product(Brand.ACER, "dsdkkdsksds", 368.89, "is a pc", "idskdskdk", 10, 8);

        Cart cart = new Cart();

        cart.addOnCart(computer);
        cart.addOnCart(computers);

        Assertions.assertEquals(cart.getProductsOnCart().contains(computer), cart.getProductsOnCart().contains(computers));

    }

    @Test
    void totalPriceTestWithProductInferiorTo30() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 6.0, "smartphone", "SKSKK", 10, 8);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", 3.0, "tv", "SKSKK", 34, 8);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34, 6);

        Product smartphone = new Product("smartphone", "SJDJDJJSD", Brand.ACER, "SKSKK", 3.0, 10);
        Product tv = new Product("tv", "SJDJDJJSD", Brand.LG, "SKSKK", 3.0, 34);
        Product mouse = new Product("mouse", "SJDJDJJSD", Brand.LG, "SKSKK", 3.0, 34);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);
        double totalPrice = cart.totalPrice();

        Assertions.assertEquals(20.0, totalPrice);
    }

    @Test
    void totalPriceTestWithTotalPriceSuperiorTo30() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 30.0, "smartphone", "SKSKK", 10, 10);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", 3.0, "tv", "SKSKK", 3, 14);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34, 20);

        Assertions.assertEquals(0.0, cart.totalPrice());
    }

    @Test
    void priceDeliveryWithPriceOfProductSuperiorTo100() {
        Cart cart = new Cart();
        Product smartphone = new Product("smartphone", "SJDJDJJSD", Brand.ACER, "SKSKK", 30.89, 10);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);
        double totalPrice = cart.totalPrice();

        Assertions.assertEquals(36.0, totalPrice);
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


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
        Product computers = new Product(Brand.ACER, "dsdkkdsksds", 368.89, "is a pc", "idskdskdk", 10);
        Cart cart = new Cart();

        cart.addOnCart(computer);
        cart.addOnCart(computers);

        Assertions.assertEquals(cart.getProductsOnCart().contains(computer), cart.getProductsOnCart().contains(computers));

    }

    @Test
    void totalPriceTestWithProductSuperiorTo30() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 100.0, "smartphone", "SKSKK", 10);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", 3.0, "tv", "SKSKK", 34);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34);


        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);
        double totalPrice = cart.totalPrice();

        Assertions.assertEquals(106.0, totalPrice);
    }

    @Test
    void totalPriceTestWithTotalPriceSuperiorTo30() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 30.0, "smartphone", "SKSKK", 10);
        Product tv = new Product(Brand.LG, "SJDJDJJSD", 3.0, "tv", "SKSKK", 34);
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34);

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);
        double totalPrice = cart.totalPrice();

        Assertions.assertEquals(60.0, totalPrice);
    }

    @Test
    void priceDeliveryWithTotalPriceInferiorTo30() {
        Cart cart = new Cart();
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 5.89, "smartphone", "SKSKK", 10);
        Product smartphones = new Product(Brand.ACER, "SJDJDJJSD", 13.89, "smartphone", "SKSKK", 10);


        cart.addOnCart(smartphone);
        double priceDelivery = cart.priceDelivery();

        Assertions.assertEquals(8.0, priceDelivery);

    }

    @Test
    void priceDeliveryWithPriceOfProductSuperiorTo30() {
        Cart cart = new Cart();
        Product raspberryPi4 = new Product(Brand.LG, "SJDJDJJSD", 6.38, "jojo", "SKSKK", 34);
        Product smartphone = new Product(Brand.ACER, "SJDJDJJSD", 30.89, "smartphone", "SKSKK", 10);

        cart.addOnCart(raspberryPi4);
        cart.addOnCart(smartphone);
        double priceDelivery = cart.priceDelivery();

        Assertions.assertEquals(0.0, priceDelivery);
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
        double calculateIva = cart.calculateIva();

        Assertions.assertEquals(1.98, calculateIva);

    }
}


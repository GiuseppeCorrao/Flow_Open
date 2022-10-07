import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Cart;
import products.Product;


public class CartTest {


    @Test
    void buyTest() {
        Cart cart = new Cart();
        Product computer = new Product(Brand.ACER, "Black", 329.00, "This PC works", "pc", 4, 10);
        Product computer1 = new Product(Brand.HP, "Black", 329.00, "This PC works", "PC ", 4, 10);

        cart.addOnCart(computer);
        cart.addOnCart(computer1);
        cart.buy();

        Assertions.assertTrue(cart.getProductsOnCart().isEmpty());
    }

    @Test
    void abortTest() {
        Product product = new Product(Brand.ACER, "TravelMate P2", 329.00, "pc", "This PC works", 4, 8);
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
        Product mouse = new Product(Brand.LG, "SJDJDJJSD", 3.0, "mouse", "SKSKK", 34, 30);


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

        cart.addOnCart(smartphone);
        cart.addOnCart(tv);
        cart.addOnCart(mouse);
        double totalPrice = cart.totalPrice();

        Assertions.assertEquals(36.0, totalPrice);
    }
}


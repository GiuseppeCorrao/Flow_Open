import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Product;


import java.util.ArrayList;
import java.util.List;


public class CartTest {


    @Test
    void buyTest() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);
        product.setQuantity(-1);
        Assertions.assertEquals(product.getQuantity(), product.buy(product));
    }

    @Test
    void abortTest() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);
        product.setQuantity(+1);
        Assertions.assertEquals(product.getQuantity(), product.abort(product));
    }


    @Test
    void addedOnCartTest() {
        List<Product> productList = new ArrayList<>();
        Product computer = new Product(productList, Brand.ACER, "dsdkkdsksds", "jjjjd", 3.0, "idskdskdk", "computer", 10);
        computer.addedOnCart(computer);
        Assertions.assertTrue(productList.contains(computer));
    }

    @Test
    void totalPriceTest() {
        List<Product> productList = new ArrayList<>();
        Product smartphone = new Product(productList, Brand.ACER, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "smartphone", 10);
        Product tv = new Product(productList, Brand.LG, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "TV", 34);
        productList.add(smartphone);
        productList.add(tv);
        Assertions.assertEquals(6.0, smartphone.totalPrice(smartphone, tv));
    }


}

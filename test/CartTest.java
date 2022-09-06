import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;
import products.Product;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class CartTest {


    @Test
    void buyTestWithPositiveAnswer() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc");
        String input = "y";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals("200 OK", product.buy());
    }

    @Test
    void buyTestWithNegativeAnswer() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc");
        String input = "n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals("204 No Content", product.buy());
    }

    @Test
    void buyTestWithOtherAnswer() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc");
        String input = "later";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals("add to cart", product.buy());
    }


    @Test
    void addedOnCartTest() {
        List<Product> productList = new ArrayList<>();
        Product computer = new Product(productList, Brand.ACER, "dsdkkdsksds", "jjjjd", 3.0, "idskdskdk", "computer");
        productList.add(computer);
        computer.addedOnCart(computer);
        Assertions.assertTrue(productList.contains(computer));
    }

    @Test
    void totalPriceTest() {
        List<Product> productList = new ArrayList<>();
        Product smartphone = new Product(productList, Brand.ACER, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "smartphone");
        Product tv = new Product(productList, Brand.LG, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "TV");
        productList.add(smartphone);
        productList.add(tv);
        double sum = tv.getPrice() + smartphone.getPrice();
        Assertions.assertEquals(6, sum);
    }
}

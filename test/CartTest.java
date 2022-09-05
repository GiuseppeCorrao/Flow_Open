import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.params.ParameterizedTest;
import products.Brand;
import products.Cart;
import products.Product;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class CartTest {

    /**
     * @author Samuele Catalano
     * The method needs to be implemented
     */
    /*@Test
    void buyTestWithPositiveAnswer() {
        Product product = new Product(Brand.ACER,"TravelMate P2","Black",329.00,"This PC works","pc");
        String input = "y";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals("200 OK", product.buy());
    }*/

    @Test
    void addedOnCartTest() {
        Product computer = new Product(Brand.ACER,"SKSKD","DHJHSJS",3.0,"computer","computer");
       List<Product> products = new ArrayList<>();
       Cart cart = new Cart(products);

       products.add(computer);

        Assertions.assertEquals(computer,cart.addedOnCart(computer));
    }
}

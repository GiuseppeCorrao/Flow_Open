import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;
import products.Product;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ProductTest {

    @Test
    void buyTest() {
        Product product = new Product(Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC is ok for programming");
        String input = "y";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertEquals("200 OK", product.buy());
    }
}

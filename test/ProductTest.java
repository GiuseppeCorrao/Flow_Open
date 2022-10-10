import org.junit.jupiter.api.Test;
import products.Product;

import java.util.Arrays;

import static products.Brand.ASUS;

public class ProductTest {

    @Test
    public void addProductOnDBTest(){
        Product product = new Product(ASUS,"black",329.99, "a good pc", "ROGstrix",5,8);

       product.addProductOnDB(product);

       //cannot verify if Object are on DB
    }
}

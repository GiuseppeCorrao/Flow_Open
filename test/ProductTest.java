import org.junit.jupiter.api.Test;
import products.Product;

import java.util.Arrays;

import static products.Brand.ASUS;

public class ProductTest {

    @Test
    public void addProductOnDBTest(){
        Product product = new Product("ROGstrix","a good pc",ASUS,"black",329.99,5);

       product.addProductOnDB(product);



    }
}

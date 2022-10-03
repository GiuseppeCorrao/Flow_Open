import org.junit.jupiter.api.Test;
import products.Product;

import java.util.Arrays;

import static products.Brand.ASUS;

public class ProductTest {

    @Test
    public void addProductOnDBTest(){
        Product product = new Product(ASUS,"blue",329.99,"a good pc","ROGstrix",5);

       product.addProductOnDB(product);



    }
}

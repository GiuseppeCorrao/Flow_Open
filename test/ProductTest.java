import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;
import products.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void takeTheProductsTest() throws SQLException {
        Product product= new Product(Brand.APPLE, "4x4",135.00, "è un pc molto veloce, potente", "computer", 50);

        List<Product> list= new ArrayList<>();

        product.takeTheProducts(list);

        Assertions.assertFalse(list.isEmpty());
    }

}
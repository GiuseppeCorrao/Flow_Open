import businesslogic.BusinessLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;
import products.Product;

import java.util.ArrayList;
import java.util.List;


public class BusinessLogicTest {

    @Test
    void calculateIvaTest() {
        Assertions.assertEquals(73.26, BusinessLogic.calculateIva(333));
    }

    @Test
    void calculateDiscountTest(){
        BusinessLogic product= new BusinessLogic();
        Product product1= new Product(Brand.APPLE, "4x4", "rosso", 135.00, "è un pc molto veloce, potente", "computer", 50);
        Assertions.assertEquals(103.95, product.getCalculateDiscount(product1));
    }
}

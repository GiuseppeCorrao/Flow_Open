import businesslogic.BusinessLogic;
import businesslogic.DiscountPercentage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;
import products.Product;

public class BusinessLogicTest {

    @Test
    void calculateIvaTest() {
        Assertions.assertEquals(73.26, BusinessLogic.calculateIva(333));
    }

    @Test
    void calculateDiscountTest() {
        BusinessLogic businessLogic = new BusinessLogic();
        Product product = new Product(Brand.APPLE, "4x4", 135.00, "è un pc molto veloce, potente", "computer", 50, 5);
        double calculate = businessLogic.getCalculateDiscount(product, DiscountPercentage.PERCENTAGE15);

    }

}


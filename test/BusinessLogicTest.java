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
    void calculateDiscountTest(){
        BusinessLogic businessLogic= new BusinessLogic();
        Product product= new Product("computer","è un pc molto veloce, potente" ,Brand.APPLE, "black", 135.00, 50);
        double calculate= businessLogic.getCalculateDiscount(product, DiscountPercentage.PERCENTAGE15);
        Assertions.assertEquals(114.75, calculate);
    }
}

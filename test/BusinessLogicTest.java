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
<<<<<<< HEAD
    void calculateDiscountTest() {
        BusinessLogic businessLogic = new BusinessLogic();
        Product product = new Product(Brand.APPLE, "4x4", 135.00, "è un pc molto veloce, potente", "computer", 50,5);
        double calculate = businessLogic.getCalculateDiscount(product, DiscountPercentage.PERCENTAGE15);
=======
    void calculateDiscountTest(){
        BusinessLogic businessLogic= new BusinessLogic();
        Product product= new Product("computer","è un pc molto veloce, potente" ,Brand.APPLE, "black", 135.00, 50);
        double calculate= businessLogic.getCalculateDiscount(product, DiscountPercentage.PERCENTAGE15);
>>>>>>> bb91a7db9db397823a81d1db06f4b4e138f31a6e
        Assertions.assertEquals(114.75, calculate);
    }
}

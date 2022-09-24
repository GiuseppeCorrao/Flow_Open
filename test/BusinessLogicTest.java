import businesslogic.BusinessLogic;
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
    void calculateDiscountTest23(){
        BusinessLogic product= new BusinessLogic();
        Product product1= new Product(Brand.APPLE, "4x4", "rosso", 135.00, "è un pc molto veloce, potente", "computer", 50);
        Assertions.assertEquals(103.95, product.getCalculateDiscount23(product1));
    }


    @Test
    void calculateDiscountTest9(){
        BusinessLogic product= new BusinessLogic();
        Product product1= new Product(Brand.APPLE, "4x4", "rosso", 135.00, "è un pc molto veloce, potente", "computer", 50);
        Assertions.assertEquals(122.85, product.getCalculateDiscount9(product1));
    }


    @Test
    void calculateDiscountTest27(){
        BusinessLogic product= new BusinessLogic();
        Product product1= new Product(Brand.APPLE, "4x4", "rosso", 135.00, "è un pc molto veloce, potente", "computer", 50);
        Assertions.assertEquals(98.55, product.getCalculateDiscount27(product1));
    }
}

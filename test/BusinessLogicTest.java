import businesslogic.BusinessLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

public class BusinessLogicTest {

    @Test
     void calculateIvaTest(){
        BusinessLogic product = new BusinessLogic("sss","333", new String[]{},"jsjjs",Brand.ACER);
        int iva = 22;
        double price = 0;
        double calcIva = (price*iva)/100;
        Assertions.assertEquals(0,product.calculateIva());
    }
}

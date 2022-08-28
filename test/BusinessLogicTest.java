import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BusinessLogicTest {

    @Test
    void calculateIvaTest() {
        int iva = 22;
        double price = 1000;
        Assertions.assertEquals(220, (price * iva) / 100);

    }

    void calculatePassiveTest(){}
    void calculateActiveTest(){}
}


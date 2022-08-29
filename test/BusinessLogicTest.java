import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusinessLogicTest {

    @Test
    void calculateIvaTest() {
        int iva = 22;
        double price = 333;
        Assertions.assertEquals(73.26, price * iva / 100);
    }
}

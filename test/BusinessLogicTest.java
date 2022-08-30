import businesslogic.BusinessLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusinessLogicTest {

    @Test
    void calculateIvaTest() {
        Assertions.assertEquals(73.26, BusinessLogic.calculateIva(333));
    }
}

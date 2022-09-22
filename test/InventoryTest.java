import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;
import products.Inventory;
import products.Product;

public class InventoryTest {

    @Test
    void InventoryTestadd(){

        Inventory inventory = new Inventory();
        Product a14 = new Product(Brand.HUAWEI,"A14","silver",700.00,"a computer with powerful power","Computer",23);

        inventory.getProductHashMap().put("a14",a14);

        Assertions.assertTrue(inventory.getProductHashMap().containsValue(a14));
    }
}

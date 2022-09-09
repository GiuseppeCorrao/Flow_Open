package products;

import java.util.HashMap;
public class Inventory {
    HashMap productHashMap;

    public Inventory() {
        this.productHashMap = new HashMap<>();
    }

    public HashMap getProductHashMap() {
        return productHashMap;
    }

    public void setProductHashMap(HashMap productHashMap) {
        this.productHashMap = productHashMap;
    }
}

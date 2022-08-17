package businesslogic;

import motherclass.FlowOpen;
import products.Brand;

public class BusinessLogic extends FlowOpen {

    public BusinessLogic(String name, String description, String[] contact, String address, Brand brand) {
        super(name, description, contact, address, brand);
    }

    void calculateIva(){};
    void calculatePassive(){};
    void calculateActive(){};

}

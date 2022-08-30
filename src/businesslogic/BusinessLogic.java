package businesslogic;

import motherclass.FlowOpen;
import products.Brand;

public class BusinessLogic extends FlowOpen {

    public BusinessLogic(String name, String description, String[] contact, String address, Brand brand) {
        super(name, description, contact, address, brand);
    }



    public static double calculateIva(double price) {
        int iva = 22;
        return (price * iva) / 100;
    }

    void calculatePassive() {
    }

    void calculateActive() {
    }

}

package businesslogic;

import lombok.Getter;
import lombok.Setter;
import motherclass.FlowOpen;
import products.Brand;
@Getter
@Setter

public class BusinessLogic extends FlowOpen {

    public BusinessLogic(String name, String description, String[] contact, String address, Brand brand) {
        super(name, description, contact, address, brand);
    }

    double calculateIva(){
        int iva = 22;
        double price = 0;
        double calcIva = (price*iva)/100;
        return calcIva;
    }
    void calculatePassive(){}
    void calculateActive(){}

}

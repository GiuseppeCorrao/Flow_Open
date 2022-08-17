package products.hardware;

import products.Brand;
import products.Product;

public class Hardware extends Product {

    boolean ifAreUsb;
    String colorOfLed;


    public Hardware(Brand brand, String model, String color, double price, boolean ifAreUsb, String colorOfLed) {
        super(brand, model, color, price);
        this.ifAreUsb = ifAreUsb;
        this.colorOfLed = colorOfLed;
    }
}

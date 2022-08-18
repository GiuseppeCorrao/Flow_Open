package products.hardware;

import products.Brand;

public class Mouse extends Hardware {

    int numberOfKeys;


    public Mouse(Brand brand, String model, String color, double price, boolean ifAreUsb, String colorOfLed, int numberOfKeys) {
        super(brand, model, color, price, ifAreUsb, colorOfLed);
        this.numberOfKeys = numberOfKeys;

    }
}

package products.hardware;

import products.Brand;

public class Mouse extends Hardware {

    private int numberOfKeys;


    public Mouse(Brand brand, String model, String color, double price, String description, boolean ifAreUsb, String colorOfLed, int numberOfKeys) {
        super(brand, model, color, price, description, ifAreUsb, colorOfLed);
        this.numberOfKeys = numberOfKeys;
    }
}

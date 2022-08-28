package products.hardware;

import products.Brand;
import products.Product;

public class Hardware extends Product {

    private boolean ifAreUsb;
    private String colorOfLed;


    public Hardware(Brand brand, String model, String color, double price, String description, boolean ifAreUsb, String colorOfLed) {
        super(brand, model, color, price, description);
        this.ifAreUsb = ifAreUsb;
        this.colorOfLed = colorOfLed;
    }
}

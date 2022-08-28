package products.hardware;

import products.Brand;

public class Headphones extends Hardware {

    private int decibel;

    public Headphones(Brand brand, String model, String color, double price, String description, boolean ifAreUsb, String colorOfLed, int decibel) {
        super(brand, model, color, price, description, ifAreUsb, colorOfLed);
        this.decibel = decibel;
    }
}

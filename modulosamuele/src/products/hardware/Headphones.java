package products.hardware;

import products.Brand;

public class Headphones extends Hardware {

    int decibel;

    public Headphones(Brand brand, String model, String color, double price, boolean ifAreUsb, String colorOfLed, int decibel) {
        super(brand, model, color, price, ifAreUsb, colorOfLed);
        this.decibel = decibel;
    }
}

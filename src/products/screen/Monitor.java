package products.screen;

import products.Brand;

public class Monitor extends Screen{
    public Monitor(Brand brand, String model, String color, double price, String description, double frequency, long lumen, String type, int size, String resolution) {
        super(brand, model, color, price, description, frequency, lumen, type, size, resolution);
    }
}

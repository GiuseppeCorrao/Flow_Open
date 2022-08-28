package products.screen;

import products.Brand;

public class Television extends Screen{

    private boolean areAndroid;

    public Television(Brand brand, String model, String color, double price, String description, double frequency, long lumen, String type, int size, String resolution, boolean areAndroid) {
        super(brand, model, color, price, description, frequency, lumen, type, size, resolution);
        this.areAndroid = areAndroid;
    }
}

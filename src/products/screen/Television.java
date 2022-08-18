package products.screen;

import products.Brand;

public class Television extends Screen{

    boolean areAndroid;

    public Television(Brand brand, String model, String color, double price, double Frequency, long Lumen, String type, int size,
                      String resolution, boolean areAndroid) {
        super(brand, model, color, price, Frequency, Lumen, type, size, resolution);
        this.areAndroid = areAndroid;
    }
}

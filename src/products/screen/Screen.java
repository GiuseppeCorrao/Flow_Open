package products.screen;

import products.Brand;
import products.Product;

public class Screen extends Product {

    private double Frequency;
    private long Lumen;
    private String type;
    private int size;
    private String resolution;

    public Screen(Brand brand, String model, String color, double price, String description, double frequency, long lumen, String type, int size, String resolution) {
        super(brand, model, color, price, description);
        Frequency = frequency;
        Lumen = lumen;
        this.type = type;
        this.size = size;
        this.resolution = resolution;
    }
}

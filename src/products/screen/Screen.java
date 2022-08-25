package products.screen;

import products.Brand;
import products.Product;

public class Screen extends Product {

    double Frequency;
    long Lumen;
    String type;
    int size;
    String resolution;

    public Screen(Brand brand, String model, String color, double price, double Frequency, long Lumen, String type, int size,
                  String resolution) {
        super(brand, model, color, price);
    }
}

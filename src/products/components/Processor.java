package products.components;

import products.Brand;

public class Processor extends Components {

    String type;
    double GHz;


    public Processor(Brand brand, String model, String color,double price, int availability, String type, double GHz) {
        super(brand, model, color, price, availability);
        this.type = type;
        this.GHz = GHz;
    }
}

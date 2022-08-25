package products.components;

import products.Brand;

public class StorageSpace extends Components {

    double GBStorage;
    String RAM;


    public StorageSpace(Brand brand, String model, String color, double price, int availability, double GBStorage, String RAM) {
        super(brand, model, color, price, availability);
        this.GBStorage = GBStorage;
        this.RAM = RAM;
    }
}


package products.device;

import products.Brand;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Computer extends Device {

    String colorOfLed;


    public Computer(Brand brand, String model, String color, double price, OperatingSystem system, Processor processor, StorageSpace storage, String colorOfLed) {
        super(brand, model, color, price, system, processor, storage);
        this.colorOfLed = colorOfLed;
    }
}


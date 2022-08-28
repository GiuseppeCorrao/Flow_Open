package products.device;

import products.Brand;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Computer extends Device {

     private String colorOfLed;


    public Computer(Brand brand, String model, String color, double price, String description, OperatingSystem system, Processor processor, StorageSpace storage, String colorOfLed) {
        super(brand, model, color, price, description, system, processor, storage);
        this.colorOfLed = colorOfLed;
    }
}

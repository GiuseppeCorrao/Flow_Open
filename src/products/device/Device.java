package products.device;

import products.Brand;
import products.Product;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Device extends Product {

    OperatingSystem system;
    Processor processor;
    StorageSpace storage;

    public Device(Brand brand, String model, String color, double price, OperatingSystem system, Processor processor, StorageSpace storage) {
        super(brand, model, color, price);
        this.system = system;
        this.processor = processor;
        this.storage = storage;
    }
}




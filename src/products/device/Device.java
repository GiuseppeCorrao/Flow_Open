package products.device;

import products.Brand;
import products.Product;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Device extends Product {

    private OperatingSystem system;
    private Processor processor;
    private StorageSpace storage;

    public Device(Brand brand, String model, String color, double price, String description, OperatingSystem system, Processor processor, StorageSpace storage) {
        super(brand, model, color, price, description);
        this.system = system;
        this.processor = processor;
        this.storage = storage;
    }
}


package products.device;

import products.Brand;
import products.components.Camera;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Phone extends Device {

    int resolution;
    Camera camera;
    String typeOfDisplay;
    boolean have5G;


    public Phone(Brand brand, String model, String color, double price, OperatingSystem system, Processor processor, StorageSpace storage, int resolution, Camera camera, String typeOfDisplay, boolean have5G) {
        super(brand, model, color, price, system, processor, storage);
        this.resolution = resolution;
        this.camera = camera;
        this.typeOfDisplay = typeOfDisplay;
        this.have5G = have5G;
    }
}


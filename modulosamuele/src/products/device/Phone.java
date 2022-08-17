package products.device;

import products.components.Camera;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Phone extends Device {

    int resolution;
    Camera camera;
    String typeOfDisplay;
    boolean have5G;


    public Phone(OperatingSystem system, Processor processor, StorageSpace storage, int resolution, Camera camera, String typeOfDisplay,
                 boolean have5G) {
        super(system, processor, storage);
        this.resolution = resolution;
        this.camera = camera;
        this.typeOfDisplay = typeOfDisplay;
        this.have5G = have5G;

    }
}

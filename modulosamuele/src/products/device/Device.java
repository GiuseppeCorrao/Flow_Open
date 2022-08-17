package products.device;

import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Device {

    OperatingSystem system;
    Processor processor;
    StorageSpace storage;

    public Device(OperatingSystem system, Processor processor, StorageSpace storage) {
        this.system = system;
        this.processor = processor;
        this.storage = storage;
    }


}

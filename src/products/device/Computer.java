package products.device;

import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Computer extends Device {

    String colorOfLed;


    public Computer(OperatingSystem system, Processor processor, StorageSpace storage, String colorOfLed) {
        super(system, processor, storage);
        this.colorOfLed = colorOfLed;

    }
}

package products.software;

import products.Brand;

public class OperatingSystem extends Software{

    String versionOs;
    String kernel;
    String fileSystem;
    String scheduler;
    String memoryManager;
    String swapping;
    String memoryVirtualManager;
    String memoryProtection;
    String userInterface;
    String printSpooler;


    public OperatingSystem(String name, String description, String version, double price, String typeOfBit, String versionOs, String kernel, String fileSystem, String scheduler, String memoryManager, String swapping, String memoryVirtualManager, String memoryProtection, String userInterface, String printSpooler) {
        super(name, description, version, price, typeOfBit);
        this.versionOs = versionOs;
        this.kernel = kernel;
        this.fileSystem = fileSystem;
        this.scheduler = scheduler;
        this.memoryManager = memoryManager;
        this.swapping = swapping;
        this.memoryVirtualManager = memoryVirtualManager;
        this.memoryProtection = memoryProtection;
        this.userInterface = userInterface;
        this.printSpooler = printSpooler;
    }
}



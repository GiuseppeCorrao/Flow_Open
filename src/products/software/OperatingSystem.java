package products.software;

public class OperatingSystem extends Software{

    private String versionOs;
    private String kernel;
    private String fileSystem;
    private String scheduler;
    private String memoryManager;
    private String swapping;
    private String memoryVirtualManager;
    private String memoryProtection;
    private String userInterface;
    private String printSpooler;


    public OperatingSystem(String name, String description, String version, double price, String typeOfBit, String versionOs,
                           String kernel, String fileSystem, String scheduler, String memoryManager, String swapping,
                           String memoryVirtualManager, String memoryProtection, String userInterface, String printSpooler) {
        super(name, description, version, price, typeOfBit);
        this.versionOs = versionOs;
        this.kernel= kernel;
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

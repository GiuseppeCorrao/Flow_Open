package products.components;

public class StorageSpace extends Components {

    double GBStorage;
    String RAM;


    public StorageSpace(double price, int availability, double GBStorage, String RAM) {
        super(price, availability);
        this.GBStorage = GBStorage;
        this.RAM = RAM;
    }
}

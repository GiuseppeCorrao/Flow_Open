package products.device;

import products.Brand;
import products.components.Components;
import products.components.Processor;
import products.components.StorageSpace;
import products.software.OperatingSystem;

public class Console extends Device {

    Components[] components;
    int numberOfController;
    boolean haveAGame;
    String game;


    public Console(Brand brand, String model, String color, double price, OperatingSystem system, Processor processor, StorageSpace storage, Components[] components, int numberOfController, boolean haveAGame, String game) {
        super(brand, model, color, price, system, processor, storage);
        this.components = components;
        this.numberOfController = numberOfController;
        this.haveAGame = haveAGame;
        this.game = game;
    }
}


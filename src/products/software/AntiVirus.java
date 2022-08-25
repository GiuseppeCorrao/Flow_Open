package products.software;

import products.Brand;

public class AntiVirus extends  Software{

    boolean liveScanner;
    boolean planificatedScansions;
    boolean adsBlock;
    boolean clean;


    public AntiVirus(String name, String description, String version, double price, String typeOfBit, boolean liveScanner, boolean planificatedScansions, boolean adsBlock, boolean clean) {
        super(name, description, version, price, typeOfBit);
        this.liveScanner = liveScanner;
        this.planificatedScansions = planificatedScansions;
        this.adsBlock = adsBlock;
        this.clean = clean;
    }
}


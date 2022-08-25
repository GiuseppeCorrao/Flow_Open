package products.software;

import products.Brand;

public class OfficeAutomation extends Software{

    OperatingSystem oS;
    boolean wordProcessor;
    boolean spreadSheets;
    boolean database;
    boolean graphicSoftware;
    boolean email;


    public OfficeAutomation(String name, String description, String version, double price, String typeOfBit, OperatingSystem oS, boolean wordProcessor, boolean spreadSheets, boolean database, boolean graphicSoftware, boolean email) {
        super(name, description, version, price, typeOfBit);
        this.oS = oS;
        this.wordProcessor = wordProcessor;
        this.spreadSheets = spreadSheets;
        this.database = database;
        this.graphicSoftware = graphicSoftware;
        this.email = email;
    }
}



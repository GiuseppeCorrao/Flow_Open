package products.software;

public class OfficeAutomation extends Software{

    OperatingSystem oS;
    boolean wordProcessor;
    boolean spreadSheets;
    boolean database;
    boolean graphicSoftware;
    boolean email;


    public OfficeAutomation(String name, String description, String version, double price, String typeOfBit, OperatingSystem os,
                            boolean wordProcessor, boolean spreadSheets, boolean database, boolean graphicSoftware, boolean email) {
        super(name, description, version, price, typeOfBit);
        this.oS = os;
        this.wordProcessor = wordProcessor;
        this.spreadSheets = spreadSheets;
        this.database = database;
        this.graphicSoftware = graphicSoftware;
        this.email = email;

    }
}

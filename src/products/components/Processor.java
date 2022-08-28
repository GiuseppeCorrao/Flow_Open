package products.components;

public class Processor extends Components {

    private String type;
    private double GHz;


    public Processor(double price, int availability, String type, double GHz) {
        super(price, availability);
        this.type = type;
        this.GHz = GHz;
    }
}

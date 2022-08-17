package products.components;

public class Processor extends Components {

    String type;
    double GHz;


    public Processor(double price, int availability, String type, double GHz) {
        super(price, availability);
        this.type = type;
        this.GHz = GHz;
    }
}

package products.components;

public class Camera extends Components {

    private int mpx;


    public Camera(double price, int availability, int mpx) {
        super(price, availability);
        this.mpx = mpx;
    }

}

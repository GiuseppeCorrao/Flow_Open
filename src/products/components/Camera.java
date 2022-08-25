package products.components;

import products.Brand;

public class Camera extends Components {

    int mpx;


    public Camera(Brand brand, String model, String color, double price, int availability, int mpx) {
        super(brand, model, color, price, availability);
        this.mpx = mpx;
    }

}

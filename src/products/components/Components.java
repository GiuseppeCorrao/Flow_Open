package products.components;

import products.Brand;
import products.Product;

public class Components extends Product {


    int availability;


    public Components(Brand brand, String model, String color, double price,int availability) {
        super(brand, model, color, price);
        this.availability = availability;
    }

}


package motherclass;

import products.Brand;

public class FlowOpen {

    String name;
    String description;
    String[] contact;
    String address;
    Brand brand;

    public FlowOpen(String name, String description, String[] contact, String address, Brand brand){
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.address = address;
        this.brand = brand;


    }
}

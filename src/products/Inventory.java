package products;

import motherclass.FlowOpen;

import java.util.List;

public class Inventory {

    List<Product> products;
    int quantityProducts;

    public Inventory(String name, String description, String[] contact, String address, Brand brand, List<Product> products,
                     int quantityProducts) {

        this.products = products;
        this.quantityProducts = quantityProducts;
    }
}

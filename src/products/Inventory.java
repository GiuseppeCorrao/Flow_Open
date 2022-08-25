package products;

import motherclass.FlowOpen;

import java.util.List;

public class Inventory extends FlowOpen {

    List<Product> products;
    int quantityProducts;

    public Inventory(String name, String description, String[] contact, String address, Brand brand, List<Product> products,
                     int quantityProducts) {
        super(name, description, contact, address, brand);
        this.products = products;
        this.quantityProducts = quantityProducts;
    }
}

package products;


import java.util.List;

public class Inventory {

    List<Product> products;
    int quantityProducts;

    public Inventory(List<Product> products,int quantityProducts) {

        this.products = products;
        this.quantityProducts = quantityProducts;
    }
}

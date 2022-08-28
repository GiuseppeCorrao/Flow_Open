package products;

public class Product {

    private Brand brand;
    private String model;
    private String color;
    private double price;
    private String description;


    public Product(Brand brand, String model, String color, double price, String description) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.description = description;


    }
}

package products;


public class Product {

    /**
     * @author Giuseppe Corrao
     * @version 2.0
     * this class has been refactor + add getter and setter
     */

    private Brand brand;
    private String model;
    private String color;
    private double price;
    private String description;

    private String product;
    private int quantity;


    public Product(Brand brand, String model, String color, double price, String description, String product, int quantity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.description = description;
        this.product = product;
        this.quantity = quantity;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }


}



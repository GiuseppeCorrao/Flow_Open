package products;


public class Product {

    /**
     * @author Giuseppe Corrao
     * @version 2.0
     * this class has been refactor + add getter and setter
     */

    private Brand brand;
    private String color;
    private double price;
    private String description;
    private String name;
    private int quantity;
    private double priceDelivery;

    public double getPriceDelivery() {
        return priceDelivery;
    }

    public Product(Brand brand, String color, double price, String description, String name, int quantity, double priceDelivery) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.description = description;
        this.name = name;
        this.quantity = quantity;
        this.priceDelivery = priceDelivery;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "brand=" + brand + ", color='" + color + '\'' + ", price=" + price + ", description='" + description + '\'' + ", name='" + name + '\'' + ", quantity=" + quantity + '}';
    }
}



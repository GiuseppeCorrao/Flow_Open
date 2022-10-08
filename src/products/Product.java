package products;


import java.sql.*;
import java.util.List;

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


    /**
     * @refactor of this param
     * @param name = porduct_name
     * @param description = product_description
     * @param brand = product_brand
     * @param color = product_color
     * @param price = product_price
     * @param quantity = product_quantity
     * = (value) correspond at any row of product on db
     */

    public Product(String name, String description, Brand brand, String color, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.quantity = quantity;

    }

    /**
     * @Author Giuseppe Corrao
     * this metodh add a user on db with PreparedStatement
     */
    public void addProductOnDB(Product p) {


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopendev", "developer", "developer");

            Statement state = connection.createStatement();

            String sql = "INSERT INTO product (product_name,product_price,product_color,product_description,product_quantity,product_brand) VALUES (?,?,?,?,?,?);";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, p.name);
            pstmt.setDouble(2, p.price);
            pstmt.setString(3, p.color);
            pstmt.setString(4, p.description);
            pstmt.setInt(5, p.quantity);
            pstmt.setString(6, String.valueOf(p.brand));

            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        return "Product{" +
                "brand=" + brand +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}



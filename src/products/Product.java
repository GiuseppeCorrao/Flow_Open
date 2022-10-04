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



    public Product(Brand brand,String color, double price, String description, String name, int quantity) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.description = description;
        this.name = name;
        this.quantity = quantity;

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


    public List<Product> takeTheProducts(List<Product> listOfProducts) throws SQLException {

        try {
            Connection connection;

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/flowopenDev", "root", "dante123");

            Statement statement= connection.createStatement();

            ResultSet resultSet= statement.executeQuery("select * from Product");
            while (resultSet.next()){

                Integer product_id= resultSet.getInt("product_id");
                String nameProduct= resultSet.getString("product_name");
                Float priceProduct= resultSet.getFloat("product_price");
                String colorProduct= resultSet.getString("product_color");
                String descriptionProduct= resultSet.getString("product_description");
                Integer quantityProduct= resultSet.getInt("product_quantity");
                Brand.valueOf(resultSet.getString("product_brand"));
            }

            connection.close();
        }catch (SQLException error){
            error.printStackTrace();
        }
        return listOfProducts;
    }

}



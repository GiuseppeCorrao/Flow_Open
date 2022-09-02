package products;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

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

    public String buy() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Do you want to confirm the purchase?[Y/n]");
        if (input.equalsIgnoreCase("y"))
            return "200 OK";
        else if (input.equalsIgnoreCase("n"))
            return "204 No Content";
        else
            return "add to chart";
    }
}

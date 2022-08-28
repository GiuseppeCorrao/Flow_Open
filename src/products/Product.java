package products;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
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

    /**
     * This method is used to make the user buy the product
     * "200 OK" means that the purchase was successful
     * "204 No Content" means that the purchase has been canceled
     */
    private void buy() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Do you want to confirm the purchase?[Y/n]");
        if (input.equalsIgnoreCase("y")) System.out.println("200 OK");
        else if (input.equalsIgnoreCase("n")) System.out.println("204 No Content");
        else System.out.println("add to chart");

    }

}


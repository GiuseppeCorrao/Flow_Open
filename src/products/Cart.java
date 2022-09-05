package products;


import java.util.List;
import java.util.Scanner;

public class Cart {

    List<Product> productsOnCart;

    public Cart(List<Product> productsOnCart) {
        this.productsOnCart = productsOnCart;

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

    public List<Product> addedOnCart(Product p) {

        productsOnCart.add(p);
        return productsOnCart;
    }

    /**
     * @author Samuele Catalano
     * This method needs to be fixed
     */
    /*
    private double totalPrice(Product product) {
        productsOnCart.size();
        System.out.println("The total price of your products in the cart is ");
        return ;
    }*/
}

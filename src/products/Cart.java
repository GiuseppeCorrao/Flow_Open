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
            return "add to cart";
    }

    public void addedOnCart(Product p) {

        productsOnCart.add(p);

    }


    public void totalPrice(List<Product> p) {
        for (int i = 0; i < productsOnCart.size(); i++) {
            p.get(i).getPrice();
        }
    }
}

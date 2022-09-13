package products;


import java.util.ArrayList;
import java.util.List;


public class Cart {

    List<Product> productsOnCart;


    public Cart() {
        this.productsOnCart = new ArrayList<Product>();

    }


    public boolean buy(Product p) {
        productsOnCart.add(p);
        for (int i = 0; i < productsOnCart.size(); i++) {
            productsOnCart.remove(i);
        }
        return productsOnCart.isEmpty();


        //insert http request
    }


    /**
     * @author Samuele Catalano
     * This method adds a quantity to the product when you cancel the purchase
     */
    public void abort() {
        for (int i = 0; i < productsOnCart.size(); i++) {
            productsOnCart.remove(i);
        }

    }


    public boolean addOnCart(Product p) {

        productsOnCart.add(p);

        return productsOnCart.isEmpty();
    }


    public double totalPrice() {
        double sum = 0;
        for (int i = 0; i < productsOnCart.size(); i++) {

            sum += productsOnCart.get(i).getPrice();

        }
        return sum;
    }

    /**
     * This method determines when the client pay the delivery and when he doesn't
     * @author Samuele Catalano
     */
    public double priceDelivery() {
        double priceDelivery = 15;
        for (int i = 0; i < productsOnCart.size(); i++) {
            if (productsOnCart.get(i).getPrice() > 20) {
                priceDelivery = productsOnCart.get(i).getPrice();
                System.out.println("The total price is " + priceDelivery);
            } else {
                priceDelivery += productsOnCart.get(i).getPrice();
                System.out.println("The total price is " + priceDelivery);
            }
        }
        return priceDelivery;

    }
}

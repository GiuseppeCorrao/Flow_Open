package products;


import java.util.ArrayList;
import java.util.List;


public class Cart {

    List<Product> productsOnCart;


    public Cart() {
        this.productsOnCart = new ArrayList<Product>();

    }


    public void buy() {
        productsOnCart.clear();
    }  //insert http request


    /**
     * @author Samuele Catalano
     * @version 4.0
     * This method leaves the quantity of the products unchanged when you cancel the purchase
     */
    public void abort() {

        productsOnCart.clear();
    }


    public void addOnCart(Product p) {
        productsOnCart.add(p);
    }


    public double totalPrice() {
        Cart cart = new Cart();
        double sum = 0;
        for (int i = 0; i < productsOnCart.size(); i++) {

            sum += productsOnCart.get(i).getPrice();
            sum += cart.priceDelivery();

        }
        return sum;
    }


    /**
     * This method determines when the client pay the delivery and when he doesn't
     *
     * @version 2.0
     * @author Samuele Catalano
     */
    public double priceDelivery() {
        double priceDelivery = 15;
        if (totalPrice() > 100) {
            return priceDelivery = 0;
        } else {
            return priceDelivery;
        }

    }


    @Deprecated
    public double calculateIva() {
        int iva = 22;
        return (totalPrice() * iva) / 100;
    }

    public List<Product> getProductsOnCart() {
        return productsOnCart;
    }
}

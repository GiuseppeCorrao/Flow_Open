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

        }
        if(sum>30){
            return sum;
        }else{
            for(int i=0; i<productsOnCart.size(); i++) {
                return sum += productsOnCart.get(i).getPriceDelivery();
            }

        }

        return sum;
    }



    public List<Product> getProductsOnCart() {
        return productsOnCart;
    }
}
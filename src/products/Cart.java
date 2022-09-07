package products;


import java.util.List;


public class Cart {

    List<Product> productsOnCart;

    public Cart(List<Product> productsOnCart) {
        this.productsOnCart = productsOnCart;
    }

    public int buy(Product p) {
        p.setQuantity(-1);
        return p.getQuantity();
    }

    /**
     * @author Samuele Catalano
     * This method adds a quantity to the product when you cancel the purchase
     * @param p of Product
     * @return p.getQuantity()
     */
    public int abort(Product p) {
        p.setQuantity(+1);
        return p.getQuantity();
    }


    public List<Product> addedOnCart(Product p) {

        productsOnCart.add(p);
        return productsOnCart;

    }


    public double totalPrice(Product p, Product p1) {

        double sum = p.getPrice() + p1.getPrice();

        return sum;


    }


}

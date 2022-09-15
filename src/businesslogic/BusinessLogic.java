package businesslogic;


import products.Product;

public class BusinessLogic {

    public static double calculateIva(double price) {
        int iva = 22;
        return (price * iva) / 100;
    }

    public double getCalculateDiscount(Product product){
        int discountPercentage= 23;
        double priceDiscount= (discountPercentage * product.getPrice())/100;
        priceDiscount= product.getPrice() - priceDiscount;
        return priceDiscount;
    }
}

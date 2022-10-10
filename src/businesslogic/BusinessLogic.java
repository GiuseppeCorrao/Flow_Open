package businesslogic;


import products.Product;

public class BusinessLogic {

    @Deprecated
    public static double calculateIva(double price) {
        int iva = 22;
        return (price * iva) / 100;
    }



    @Deprecated
    public double getCalculateDiscount(Product product, DiscountPercentage discountPercentage) {
        double priceDiscount = (discountPercentage.getPercentage() * product.getPrice()) / 100;
        double result = product.getPrice() - priceDiscount;
        return result;
    }
}

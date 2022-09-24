package businesslogic;


import products.Product;

public class BusinessLogic {


    @Deprecated
    public static double calculateIva(double price) {
        int iva = 22;
        return (price * iva) / 100;
    }

    public double getCalculateDiscount23(Product product) {
        DiscountPercentage percentage= DiscountPercentage.PERCENTAGE23;
        double priceDiscount = (Integer.parseInt(percentage.getPercentage()) * product.getPrice()) / 100;
        double result = product.getPrice() - priceDiscount;
        return result;
    }


    public double getCalculateDiscount9(Product product) {
        DiscountPercentage percentage= DiscountPercentage.PERCENTAGE9;
        double priceDiscount = (Integer.parseInt(percentage.getPercentage()) * product.getPrice()) / 100;
        double result = product.getPrice() - priceDiscount;
        return result;
    }


    public double getCalculateDiscount27(Product product) {
        DiscountPercentage percentage= DiscountPercentage.PERCENTAGE27;
        double priceDiscount = (Integer.parseInt(percentage.getPercentage()) * product.getPrice()) / 100;
        double result = product.getPrice() - priceDiscount;
        return result;
    }
}

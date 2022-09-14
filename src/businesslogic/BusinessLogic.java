package businesslogic;


public class BusinessLogic {

    public static double calculateIva(double price) {
        int iva = 22;
        return (price * iva) / 100;
    }

    public static double getCalculateDiscount(double newPrice, int sconto){
        double out= (newPrice * sconto)/100;
        out= newPrice - out;
        return out;
    }
}

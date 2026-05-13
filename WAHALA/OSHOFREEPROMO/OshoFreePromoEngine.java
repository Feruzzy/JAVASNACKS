import java.util.Scanner;

public class OshoFreePromoEngine {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("WELCOME TO LABEKE NIGERIA");
        System.out.println("\nCART TOTAL\tDISCOUNT\tPROMO CODE");
        System.out.println("LESS THAN 5,000\t0%\tSTARTER10 (not applicable below 5k)");
        System.out.println("5,000 - 14,999\t10%\tSTARTER10");
        System.out.println("15,000 - 29,999\t20%\tBIGBOY20");
        System.out.println("30,000 ABOVE\t35%\tOSHOFREE35");

        System.out.print("\nENTER CART TOTAL: ");
        double cartTotal = inputCollector.nextDouble();
        
        System.out.print("ENTER PROMO CODE: ");
        String promoCode = inputCollector.next().toUpperCase();

        double finalPrice = calculateFinalPrice(cartTotal, promoCode);
        System.out.printf("Final Price: %.2f%n", finalPrice);
    }

    public static double calculateFinalPrice(double cartTotal, String promoCode) {
        double discountRate = 0.0;

        if (cartTotal >= 5000 && cartTotal <= 14999 && promoCode.equals("STARTER10")) {
            discountRate = 0.10;
        } else if (cartTotal >= 15000 && cartTotal <= 29999 && promoCode.equals("BIGBOY20")) {
            discountRate = 0.20;
        } else if (cartTotal >= 30000 && promoCode.equals("OSHOFREE35")) {
            discountRate = 0.35;
        }

        return cartTotal - (cartTotal * discountRate);
    }
}

import java.util.Scanner;

public class DiscountCalculator {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter the original price: ");
double price = input.nextDouble();

        
System.out.print("Enter the discount percentage: ");
double discountPercent = input.nextDouble();

        
        
double discountAmount = (price * discountPercent) / 100.0;

        
double finalPrice = price - discountAmount;

       
System.out.println("\nCalculation Results");
System.out.printf("Original Price:   #%.2f%n", price);
System.out.printf("Discount Amount:  #%.2f%n", discountAmount);
System.out.printf("Final Price:      #%.2f%n", finalPrice);

        
}
}

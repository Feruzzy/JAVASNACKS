import java.util.Scanner;

public class MonthlySavingsCalculator {

public static void main(String[] args) {

        
Scanner input = new Scanner(System.in);
        
        
final double MONTHLY_INTEREST_RATE = 0.003125;

final int TOTAL_MONTHS = 6;
        
System.out.print("Enter the monthly saving amount: ");

double monthlyDeposit = input.nextDouble();
        
double currentBalance = 0.0;
        
System.out.println("\nAccount value for each month:");
        
        
for (int month = 1; month <= TOTAL_MONTHS; month++) {
            
currentBalance = (currentBalance + monthlyDeposit) * (1 + MONTHLY_INTEREST_RATE);
            
            
System.out.printf("Month %d: $%.2f%n", month, currentBalance);
}
        
       
}
}

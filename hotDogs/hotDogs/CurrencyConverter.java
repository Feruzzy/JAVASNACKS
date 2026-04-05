import java.util.Scanner;

public class CurrencyConverter {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the exchange rate: ");
double rate = input.nextDouble();
System.out.print("Enter 0 (USD to RMB) or 1 (RMB to USD): ");
int option = input.nextInt();

        
switch (option) {
case 0:
System.out.print("Enter USD: ");
double usd = input.nextDouble();
System.out.println(usd + " USD is " + (usd * rate) + " RMB");
break;
case 1:
System.out.print("Enter RMB: ");
double rmb = input.nextDouble();
System.out.println(rmb + " RMB is " + (rmb / rate) + " USD");
break;
default:
System.out.println("Invalid input");
}
input.close();
}
}

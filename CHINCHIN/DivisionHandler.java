import java.util.Scanner;

public class DivisionHandler {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

try {
System.out.print("Enter first integer (m): ");
int m = scanner.nextInt();

System.out.print("Enter second integer (n): ");
int n = scanner.nextInt();

            
int result = m / n;
System.out.println("Result (m/n): " + result);

} catch (ArithmeticException e) {
            
System.out.println("Error: Division by zero is not allowed.");
} catch (Exception e) {
          
System.out.println("Error: Invalid input provided.");
} finally {
 
}
}
}

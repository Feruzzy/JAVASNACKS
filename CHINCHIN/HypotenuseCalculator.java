import java.util.Scanner;

public class HypotenuseCalculator {

public static void main(String[] args) {

        
Scanner scanner = new Scanner(System.in);

        
System.out.print("Enter the length of the first leg: ");
double side1 = scanner.nextDouble();

        
System.out.print("Enter the length of the second leg: ");
double side2 = scanner.nextDouble();


double hypotenuse = Math.hypot(side1, side2);

        
System.out.println("The length of the hypotenuse is: " + hypotenuse);

        
}
}

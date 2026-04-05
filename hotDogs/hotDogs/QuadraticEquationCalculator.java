import java.util.Scanner;

public class QuadraticEquationCalculator {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        
System.out.print("Enter a: ");
double a = input.nextDouble();

System.out.print("Enter b: ");
double b = input.nextDouble();

System.out.print("Enter b: ");
double c = input.nextDouble();

        
double discriminant = Math.pow(b, 2) - (4 * a * c);

        
if (discriminant > 0) {
double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.printf("The equation has two roots: %.5f and %.5f\n", root1, root2);
} 
else if (discriminant == 0) {
double root = -b / (2 * a);
System.out.printf("The equation has one root: %.1f\n", root);
} 
else {
System.out.println("The equation has no real roots.");
}
        
        
}
}

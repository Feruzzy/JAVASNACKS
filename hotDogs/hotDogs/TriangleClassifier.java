import java.util.Scanner;

public class TriangleClassifier {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        
System.out.println("Enter the first side of the triangle:");
double a = input.nextDouble();

System.out.println("Enter the second side of the triangle:");
double b = input.nextDouble();

System.out.println("Enter the third side of the triangle:");
double c = input.nextDouble();

    
if ((a + b > c) && (a + c > b) && (b + c > a)) {
System.out.println("The sides form a valid triangle.");

            
if (a == b && b == c) {
System.out.println("Type: Equilateral Triangle");
} 
else if (a == b || b == c || a == c) {
                
System.out.println("Type: Isosceles Triangle");
} 
else {
                
System.out.println("Type: Scalene Triangle");
}
} 
else {
System.out.println("The sides do not form a valid triangle.");
}

    
}
}

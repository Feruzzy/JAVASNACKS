import java.util.Scanner;

public class RectanglePerimeterCalculator {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter the length of the first edge: ");
double edge1 = input.nextDouble();

System.out.print("Enter the length of the second edge: ");
double edge2 = input.nextDouble();

        
if (edge1 != edge2) {
            
double perimeter = 2 * (edge1 + edge2);
System.out.println("The input is valid.");
System.out.println("The perimeter of the rectangle is: " + perimeter);
} 
else {
            
System.out.println("The input is invalid. Edges must be of different lengths.");
}

     
}
}

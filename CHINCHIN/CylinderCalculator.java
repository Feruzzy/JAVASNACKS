import java.util.Scanner; 

public class CylinderCalculator {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter the radius of the cylinder: ");
double radius = input.nextDouble();

       
System.out.print("Enter the height of the cylinder: ");
double height = input.nextDouble();

        
double volume = Math.PI * Math.pow(radius, 2) * height;
double surfaceArea = 2 * Math.PI * radius * (radius + height);

        
System.out.printf("The Volume of the cylinder is: %.2f%n", volume);
System.out.printf("The Surface Area of the cylinder is: %.2f%n", surfaceArea);



System.out.println("The Volume of the cylinder is: " + volume);
System.out.println("The Surface Area of the cylinder is: " + surfaceArea);


}
}

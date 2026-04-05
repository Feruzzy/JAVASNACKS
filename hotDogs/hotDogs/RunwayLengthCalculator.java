import java.util.Scanner;

public class RunwayLengthCalculator {

public static void main(String[] args) {

       
Scanner input = new Scanner(System.in);

        
System.out.print("Enter speed (v) in m/s: ");
double v = input.nextDouble();

        
System.out.print("Enter acceleration (a) in m/s^2: ");
double a = input.nextDouble();

        
double length = Math.pow(v, 2) / (2 * a);

        
System.out.printf("The minimum runway length for this airplane is %.3f meters\n", length);
        

}
}

import java.util.Scanner;

public class DistanceCoveredCalculator {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter velocity u(m/s): ");
double u = input.nextDouble();


System.out.println("Enter time span t(s): ");
double t = input.nextDouble();


System.out.println("Enter acceleration a(m/s^2): ");
double a = input.nextDouble();


double s = (u * t) + (0.5 * a * t * t);




System.out.println("The distance covered is: " + s + " meters");





}
}
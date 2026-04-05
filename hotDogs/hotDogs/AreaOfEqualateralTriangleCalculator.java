import java.util.Scanner;

public class AreaOfEqualateralTriangleCalculator {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter length:");
double length = input.nextDouble();



double sqrtResult = Math.sqrt(3) / 4;


double squaredResult = Math.pow(length, 2);

double area = sqrtResult * squaredResult;

System.out.println("The area of the equilateral triangle is: " + area);

input.close();



}
}
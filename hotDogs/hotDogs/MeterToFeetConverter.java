import java.util.Scanner;

public class MeterToFeetConverter {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter a number in meters:");
double meters = input.nextDouble();

double result = meters * 3.2786;


System.out.println("Meters to feet is: " + result);



}
}
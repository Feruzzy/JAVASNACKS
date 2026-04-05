import java.util.Scanner;

public class SqareMetersIntoPingConverter {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter a number in square meters:");
double squaremeters = input.nextDouble();

double result = squaremeters * 0.3025;


System.out.println("Squaremeters to ping is: " + result);



}
}
import java.util.Scanner;

public class MileToKilogramConverter {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter a number in miles:");
int miles = input.nextInt();


System.out.println("Miles to kilogram is: " + miles*1.6);



}
}
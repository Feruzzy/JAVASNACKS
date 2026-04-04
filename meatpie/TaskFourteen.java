import java.util.Scanner;

public class TaskFourteen {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number:");
int number1 = input.nextInt();

System.out.println("Enter second number:");
int number2 = input.nextInt();

System.out.println("Enter third number:");
int number3 = input.nextInt();


int sum = number1 + number2 + number3;

int length = 3;

int avg = sum / length;

System.out.println("The average is: " + avg);



}
}

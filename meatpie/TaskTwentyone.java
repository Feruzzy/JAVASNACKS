import java.util.Scanner;

public class TaskTwentyone {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter base:");
int base = input.nextInt();

System.out.println("Enter height:");
int height = input.nextInt();



int baseheight = base * height;

int half = 2;

int area = baseheight / 2;

System.out.println("The area of the triangle is: " + area);



}
}
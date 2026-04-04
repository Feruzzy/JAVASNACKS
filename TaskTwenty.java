import java.util.Scanner;

public class TaskTwenty {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter length:");
int length = input.nextInt();

System.out.println("Enter width:");
int width = input.nextInt();


int area = length * width;


System.out.println("The Area is: " + area);



}
}
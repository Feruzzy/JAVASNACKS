import java.util.Scanner;

public class TaskThirty {

public static void main(String[] args) {

Scanner numCollector = new Scanner(System.in);

System.out.println("Enter the first number");
int num1 = numCollector.nextInt();


System.out.println("Enter the second number");
int num2 = numCollector.nextInt();


int sum = num1 + num2;

int product = num1 * num2;

System.out.printf("sum:%d%nproduct:%d%n",sum, product);

}
}

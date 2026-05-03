import java.util.Scanner;

public class EvenChecker {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int n = input.nextInt();

System.out.println(n + " is even? " + isEven(n));
}

public static boolean isEven(int n) {
    return n % 2 == 0;
    }
}


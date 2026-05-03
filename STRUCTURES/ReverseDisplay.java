import java.util.Scanner;

public class ReverseDisplay {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number = input.nextInt();
reverse(number);
}

public static void reverse(int number) {
if (number == 0) System.out.print(0);
while (number != 0) {
    System.out.print(number % 10);
    number /= 10;
    }
    System.out.println();
    }
}


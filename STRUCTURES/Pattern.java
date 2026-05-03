import java.util.Scanner;

public class Pattern {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter n: ");
displayPattern(input.nextInt());
}

public static void displayPattern(int n) {
for (int number = 1; number <= n; number++) {
    for (int count = number; count >= 1; count--) {
    System.out.print(count + " ");

    }
System.out.println();
}
}
}

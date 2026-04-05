import java.util.Scanner;

public class DivisibilityCheck {

public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Enter an integer: ");
        
int number = scanner.nextInt();
        
        
System.out.println("Is " + number + " divisible by 2? " + (number % 2 == 0));
System.out.println("Is " + number + " divisible by 3? " + (number % 3 == 0));
System.out.println("Is " + number + " divisible by 5? " + (number % 5 == 0));
System.out.println("Is " + number + " divisible by 7? " + (number % 7 == 0));
        
       
}
}

import java.util.Scanner;

public class PalindromeChecker {

public static void main(String[] args) {

        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter a three-digit integer: ");
int number = input.nextInt();

        
int absNumber = Math.abs(number);

        
        
int firstDigit = absNumber / 100;
int thirdDigit = absNumber % 10;

        
if (firstDigit == thirdDigit) {
System.out.println(number + " is a palindrome");
} 
else {
System.out.println(number + " is not a palindrome");
}

        
}
}

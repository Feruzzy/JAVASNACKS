import java.util.Scanner;

public class SumThreeDigits {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
      
System.out.print("Enter a three-digit number: ");
int number = input.nextInt();
        
        
int digit1 = number / 100;
        
int digit2 = (number / 10) % 10;
        
        
int digit3 = number % 10;
        
        
int sum = digit1 + digit2 + digit3;
        
        
System.out.println("The sum of the digits is: " + sum);
        
        
        
}
}

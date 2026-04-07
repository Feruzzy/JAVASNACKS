import java.util.Scanner;

public class FactorChecker {

public static void main(String[] args) {

        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter the first positive integer: ");
int first = input.nextInt();
        
System.out.print("Enter the second positive integer: ");
int second = input.nextInt();

        
if (second % first == 0) {
System.out.println(first + " is a factor of " + second + ".");
} 
else {
System.out.println(first + " is NOT a factor of " + second + ".");
}

       
}
}

import java.util.Scanner; // Required to use the Scanner class

public class RangeCheck {

public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

        
System.out.print("Enter a number: ");
        
        
int number = scanner.nextInt();

        
        
if (number > 10 && number < 100) {
System.out.println("The number " + number + " is between 10 and 100.");
} 
else {
System.out.println("The number " + number + " is NOT between 10 and 100.");
}


}
}

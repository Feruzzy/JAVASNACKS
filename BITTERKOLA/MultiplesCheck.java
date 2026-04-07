import java.util.Scanner; 

public class MultiplesCheck {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter the first integer: ");
int firstInt = input.nextInt();

        
System.out.print("Enter the second integer: ");
int secondInt = input.nextInt();

        
if (secondInt == 0) {
System.out.println("Error: Cannot divide by zero. Any number other than 0 is not a multiple of 0.");
} 
        
else if (firstInt % secondInt == 0) {
System.out.printf("%d is a multiple of %d.%n", firstInt, secondInt);
} 
else {
System.out.printf("%d is NOT a multiple of %d.%n", firstInt, secondInt);
}


}
}

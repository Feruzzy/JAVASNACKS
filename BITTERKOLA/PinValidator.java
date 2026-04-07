import java.util.Scanner; 

public class PinValidator {

public static void main(String[] args) {

        
Scanner input = new Scanner(System.in);
        
System.out.print("Enter a 4-digit PIN: ");
        
        
if (input.hasNextInt()) {
int pin = input.nextInt();
            
            
if (pin >= 1000 && pin <= 9999) {
System.out.println("Valid pin");
} 
else {
System.out.println("Invalid pin");
}
} 
else {
           
System.out.println("Invalid pin (not a number)");
}
        
        
}
}

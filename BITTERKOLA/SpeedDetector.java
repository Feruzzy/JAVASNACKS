import java.util.Scanner;

public class SpeedDetector {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        
System.out.print("Enter the speed of the vehicle (km/h): ");
double speed = scanner.nextDouble();
        
if (speed < 0) {
System.out.println("Invalid speed entered.");
} 
else if (speed == 0) {
System.out.println("Stationary");
} 
else if (speed <= 40) {
System.out.println("Slow");
} 
else if (speed <= 80) {
System.out.println("Moderate");
} 
else if (speed <= 120) {
System.out.println("Fast");
} 
else {
System.out.println("Dangerously Fast");
}
        
        
}
}

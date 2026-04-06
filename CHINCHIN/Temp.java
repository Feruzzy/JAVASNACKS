import java.util.Scanner;

public class Temp {
    
public static void main(String[] args) {
System.out.print("Enter Celsius: ");
double c = new Scanner(System.in).nextDouble();

String res = (c < 0) ? "Freezing" : 
             (c <= 15) ? "Cold" : 
             (c <= 25) ? "Warm" : "Hot";

System.out.println("Classification: " + res);
}
}

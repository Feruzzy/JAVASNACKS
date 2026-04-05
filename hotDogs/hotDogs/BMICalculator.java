import java.util.Scanner;

public class BMICalculator {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

        
final double KILOGRAMS_PER_POUND = 0.45359257;
final double METERS_PER_INCH = 0.0254;

        
System.out.print("Enter weight in pounds: ");
double weightInPounds = input.nextDouble();

        
System.out.print("Enter height in inches: ");
double heightInInches = input.nextDouble();

        
double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
double heightInMeters = heightInInches * METERS_PER_INCH;

        
double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        
System.out.printf("Body Mass Index (BMI) is: %.4f\n", bmi);
        
        
if (bmi < 18.5) {
System.out.println("Category: Underweight");
} 
else if (bmi < 25.0) {
System.out.println("Category: Normal");
} 
else if (bmi < 30.0) {
System.out.println("Category: Overweight");
} 
else {
System.out.println("Category: Obese");
}
        
}
}

import java.util.Scanner;

public class BMICalculator {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

       
System.out.print("Enter weight in kg: ");
double weight = input.nextDouble();

System.out.print("Enter height in meters: ");

double height = input.nextDouble();

        
 double bmi = weight / (height * height);

        
 System.out.printf("Your BMI is: %.2f\n", bmi);

        
if (bmi < 18.5) {
System.out.println("Classification: Underweight");
} 
else if (bmi < 25.0) {
System.out.println("Classification: Normal");
} 
else if (bmi < 30.0) {
System.out.println("Classification: Overweight");
} 
else {
System.out.println("Classification: Obese");
}

        
}
}

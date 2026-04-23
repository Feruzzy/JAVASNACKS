import java.util.Scanner;


public class MilesGallons {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int miles, gallons;
int totalMiles = 0, totalGallons = 0;

System.out.print("Enter miles driven (-1 to quit): ");
miles = input.nextInt();

while (miles != -1) {
System.out.print("Enter gallons used: ");
gallons = input.nextInt();

double mpg = (double) miles / gallons;
System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

totalMiles += miles;
totalGallons += gallons;

System.out.print("\nEnter miles driven (-1 to quit): ");
miles = input.nextInt();
}

if (totalGallons != 0) {
double totalMPG = (double) totalMiles / totalGallons;
System.out.printf("Overall miles per gallon: %.2f%n", totalMPG);
}
}
}

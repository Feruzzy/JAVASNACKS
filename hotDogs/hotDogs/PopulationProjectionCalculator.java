import java.util.Scanner;

public class PopulationProjectionCalculator {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

        
System.out.print("Enter the number of years: ");
int years = input.nextInt();

        
long currentPopulation = 312032486;
long secondsInYear = 365 * 24 * 60 * 60; 

        
double birthsPerYear = (double) secondsInYear / 7;
double deathsPerYear = (double) secondsInYear / 13;
double immigrantsPerYear = (double) secondsInYear / 45;

       
double annualGrowth = birthsPerYear - deathsPerYear + immigrantsPerYear;
long finalPopulation = currentPopulation + (long)(annualGrowth * years);

        
System.out.println("The projected population after " + years + " years is " + finalPopulation);
        
        
}
}

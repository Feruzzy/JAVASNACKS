import java.util.Scanner;

public class MinutesConverter {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter the number of minutes: ");
long minutes = input.nextLong();


long minutesInYear = 60 * 24 * 365;


long years = minutes / minutesInYear;

long remainingDays = (minutes % minutesInYear) / (60 * 24);



System.out.printf("%, d minutes is %d years and %d days.%n", minutes, years, remainingDays);


input.close();



}
}
import java.util.Scanner;

public class TimeConverter {

public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
        
       
long totalMinutes = input.nextLong();

        
int minutesInDay = 24 * 60; // 1440 minutes
int minutesInHour = 60;

        
long days = totalMinutes / minutesInDay;
long remainingMinutesAfterDays = totalMinutes % minutesInDay;
long hours = remainingMinutesAfterDays / minutesInHour;
long minutes = remainingMinutesAfterDays % minutesInHour;

        
System.out.println(totalMinutes + " minutes is equivalent to:");
System.out.println(days + " days, " + hours + " hours, and " + minutes + " minutes.");

        
}
}

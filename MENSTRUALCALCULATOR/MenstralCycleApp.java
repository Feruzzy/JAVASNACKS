import java.util.Scanner;

public class MenstralCycleApp {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
                
System.out.println("Simple Menstrual Cycle Tracker");
       
System.out.print("Enter your average cycle length (e.g., 28): ");
int cycleLength = scanner.nextInt();
       
System.out.print("Enter how many days your period lasts (e.g., 5): ");
int periodLength = scanner.nextInt();

System.out.println("\n--- Your Cycle Summary ---");
       
      
for (int day = 1; day <= cycleLength; day++) {
String status = getDayStatus(day, periodLength, cycleLength);
           
            
if (status.equals("Period")) {
System.out.println("Day " + day + ": [PERIOD] - Take extra care of yourself!");
} else {
System.out.println("Day " + day + ": [FREE DAY] - Enjoy your day.");
}
}
       
System.out.println("\nNote: Your next period is expected on Day 1 of the next cycle.");
       
    }

public static String getDayStatus(int day, int periodLength, int cycleLength) {
if (day >= 1 && day <= periodLength) {
    return "Period";
} 

else {
    return "Free Day";
    }
}
}

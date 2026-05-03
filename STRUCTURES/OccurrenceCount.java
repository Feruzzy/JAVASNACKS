import java.util.Scanner;

public class OccurrenceCount {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
int[] counts = new int[51]; 

System.out.println("Enter integers between 1 and 50 (enter 0 to stop):");

int number;

while ((number = scanner.nextInt()) != 0) {
if (number >= 1 && number <= 50) {
    counts[number]++;
    }
    }

System.out.println("Occurrences:");

for (int i = 1; i <= 50; i++) {
if (counts[i] > 0) {
System.out.println(i + " occurs " + counts[i] + (counts[i] == 1 ? " time" : " times"));
}
}
}
}

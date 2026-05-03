import java.util.Scanner;

public class ScoreAnalysis {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double[] scores = new double[100];
int count = 0;
double sum = 0;

System.out.println("Enter scores (negative number to stop, max 100 scores):");
double score;


while (count < 100 && (score = scanner.nextDouble()) >= 0) {
    scores[count] = score;
    sum += score;
    count++;
    }


if (count == 0) {
System.out.println("No scores entered.");
    return;
    }


double average = sum / count;
int aboveOrEqual = 0;
int below = 0;


for (int i = 0; i < count; i++) {
if (scores[i] >= average) {
    aboveOrEqual++;
} else {
  below++;
}
}

System.out.println("Average: " + average);
System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
System.out.println("Number of scores below average: " + below);
}
}

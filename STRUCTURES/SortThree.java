import java.util.Scanner;

public class SortThree {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter three numbers: ");
displaySortedNumbers(input.nextDouble(), input.nextDouble(), input.nextDouble());
}


public static void displaySortedNumbers(double n1, double n2, double n3) {
double temp;

if (n1 < n2) { temp = n1; n1 = n2; n2 = temp; }
if (n1 < n3) { temp = n1; n1 = n3; n3 = temp; }
if (n2 < n3) { temp = n2; n2 = n3; n3 = temp; }
System.out.println(n1 + " " + n2 + " " + n3);

}
}


import java.util.Scanner;
public class Sales{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double totalSales = 0;
int item;

System.out.print("Enter item number (1-4, 0 to end): ");
item = input.nextInt();

while (item != 0) {
double value = 0;

switch (item) {
    case 1:
       value = 239.99;
    break;
    case 2:
       value = 129.75;
    break;
    case 3:
       value = 99.95;
    break;
    case 4:
       value = 350.89;
    break;
    default:
    System.out.println("Invalid item.");
}

totalSales += value;

System.out.print("Enter item number (1-4, 0 to end): ");
item = input.nextInt();
}

double earnings = 200 + (0.09 * totalSales);
System.out.printf("Total earnings: $%.2f%n", earnings);
}


}



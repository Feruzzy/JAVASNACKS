import java.util.Scanner;
public class balance{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int accountNumber;

System.out.print("Enter account number (-1 to quit): ");
accountNumber = input.nextInt();

while (accountNumber != -1) {
System.out.print("Enter beginning balance: ");
int balance = input.nextInt();
System.out.print("Enter total charges: ");
int charges = input.nextInt();

System.out.print("Enter total credits: ");
int credits = input.nextInt();

System.out.print("Enter credit limit: ");
int creditLimit = input.nextInt();

int newBalance = balance + charges - credits;

System.out.println("New balance: " + newBalance);

if (newBalance > creditLimit) {
System.out.println("Credit limit exceeded.");
}

System.out.print("\nEnter account number (-1 to quit): ");
accountNumber = input.nextInt();
}
}
}

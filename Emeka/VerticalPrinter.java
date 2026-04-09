import java.util.Scanner;

public class VerticalPrinter {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the value of N: ");
int n = input.nextInt();

for (int i = 1; i<=n; i++){

System.out.println(i);

}
}
}



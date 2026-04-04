import java.util.Scanner;

public class TaskTwentysix {

public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

System.out.println("Insert Name");
String name = inputCollector.nextLine();

System.out.println("Insert age");
int age = inputCollector.nextInt();

System.out.printf("I am %s and I am %d years old", name, age);

}
}
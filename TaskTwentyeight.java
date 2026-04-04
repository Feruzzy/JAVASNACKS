import java.util.Scanner;

public class TaskTwentyeight{

public static void main(String[] args){

Scanner numCollector = new Scanner(System.in);

System.out.println("Input digit:");
double num = numCollector.nextInt();

double overThree = num / 3;

System.out.println(overThree);

}
}
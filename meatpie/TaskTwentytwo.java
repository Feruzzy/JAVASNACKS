import java.util.Scanner;

public class TaskTwentytwo {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter radius:");
int radius = input.nextInt();



int radiusquare = radius * radius;


int area = radiusquare;

System.out.println("The area of the circle is: " + area*3.142);



}
}
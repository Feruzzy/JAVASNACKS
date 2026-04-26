import java.util.Scanner;

public class PizzaWahala {

public static void main(String[] args){


Scanner inputCollector = new Scanner(System.in);



System.out.println("WELCOME TO IYA ARAMIDE PIZZA JOINT ILUPEJU-@SEMICOLON");
System.out.println("\n PIZZA TYPE\t" + "NUMBER OF SLICES\t" + "PRICE PER BOX\t\n");
System.out.println(" SAPA SIZE\t" + "\t4" + "\t\t2,500");
System.out.println(" SMALL MONEY\t" + "\t6" + "\t\t2,900");
System.out.println(" BIG BOYS\t" + "\t8" + "\t\t4,000");
System.out.println(" ODOGWU\t" + "\t\t12" + "\t\t5,200");





System.out.print("\n ENTER PIZZA TYPE: ");
String pizzaType = inputCollector.nextLine().toUpperCase();

System.out.print(" Enter number of people: ");
int numberOfPeople = inputCollector.nextInt();



int slicesPerBox = 0;
int pricePerBox = 0;

if (pizzaType.equals("SAPA SIZE")) {
    slicesPerBox = 4;
    pricePerBox = 2500;
} else if (pizzaType.equals("SMALL MONEY")) {
    slicesPerBox = 6;
    pricePerBox = 2900;
} else if (pizzaType.equals("BIG BOYS")) {
    slicesPerBox = 8;
    pricePerBox = 4000;
} else if (pizzaType.equals("ODOGWU")) {
    slicesPerBox = 12;
    pricePerBox = 5200;
}


int totalSlicesAccumulated = 0;
int numberOfBoxes = 0;


for (numberOfBoxes = 0; totalSlicesAccumulated < numberOfPeople; numberOfBoxes++) {
    totalSlicesAccumulated = totalSlicesAccumulated + slicesPerBox;
}

           
int leftSlices = totalSlicesAccumulated - numberOfPeople;
int totalPrice = numberOfBoxes * pricePerBox;

System.out.println("\n NUMBER OF BOXES TO BUY: " + numberOfBoxes);
System.out.println(" NUMBER OF LEFT SLICES AFTER SERVING: " + leftSlices);
System.out.println(" PRICE: #" + totalPrice);
}
}



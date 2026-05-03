public class ConversionTable {

public static void main(String[] args) {

System.out.println("Miles   Kilometers | Kilometers   Miles");
for (int i = 1; i <= 10; i++) {
            
System.out.println(i + "       " + mileToKilometer(i) + "   |   " + i + "          " + kilometerToMile(i));
}
}

public static double mileToKilometer(double mile) {
    return mile * 1.609;
    }

public static double kilometerToMile(double kilometer) {
    return kilometer / 1.609;
    }
}
   

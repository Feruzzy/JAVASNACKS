public class YearDays {

public static void main(String[] args) {


System.out.println("Year  Days");
for (int year = 2014; year <= 2034; year++) {
System.out.println(year + "  " + numberOfDaysInAYear(year));
}
}

public static int numberOfDaysInAYear(int year) {
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    return 366;
    }
    return 365;
    }
}

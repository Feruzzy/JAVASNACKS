import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateAndTime {

public static void main(String[] args) {

long currentTimeMillis = System.currentTimeMillis();
Date currentDate = new Date(currentTimeMillis);

SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy HH:mm:ss");
String formattedDate = formatter.format(currentDate);


System.out.println("Current date and time is [" + formattedDate + "]");
}
}

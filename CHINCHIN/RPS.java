import java.util.*;

public class RPS {
    
public static void main(String[] args) {
 
String[] hands = {"scissors", "rock", "paper"};
int computer = new Random().nextInt(3);
       
System.out.print("Enter scissors (0), rock (1), paper (2): ");
int user = new Scanner(System.in).nextInt();


System.out.print("The computer is " + hands[computer] + ". You are " + hands[user]);

if (user == computer) 
System.out.println(" too. It is a draw.");
else if ((user - computer + 3) % 3 == 1) 
System.out.println(". You won.");
else 
System.out.println(". The computer won.");
}
}

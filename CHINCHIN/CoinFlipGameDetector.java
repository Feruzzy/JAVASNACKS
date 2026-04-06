import java.util.Scanner;
import java.util.Random;

public class CoinFlipGameDetector {
    
public static void main(String[] args) {
        
Random random = new Random();
Scanner input = new Scanner(System.in);

        
int coinResult = random.nextInt(2);

        
System.out.print("Guess the coin flip result (0 for heads, 1 forint userGuess = input.nextInt();

        
if (userGuess == coinResult) {
System.out.println("Correct! The coin was " + (coinResult == 0 ? "heads" : "tails") + ".");
 } 
else {
System.out.println("Incorrect. The coin was " + (coinResult == 0 ? "heads" : "tails") + ".");
 }

     
}
}

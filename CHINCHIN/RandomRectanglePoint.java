import java.util.Random;

public class RandomRectanglePoint {
public static void main(String[] args) {
        
final double WIDTH = 50.0;
final double HEIGHT = 150.0;
        
    
Random rand = new Random();
        
        
double x = rand.nextDouble() * WIDTH - (WIDTH / 2);
        
       
double y = rand.nextDouble() * HEIGHT - (HEIGHT / 2);
        
        
System.out.printf("Random coordinate point: (%.2f, %.2f)%n", x, y);
}
}

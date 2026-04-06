import java.util.Random;

public class RainbowArrayDetector {
    public static void main(String[] args) {
        Random rand = new Random();
        
        
        String[] colors = {"Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"};

        
        int colorNumber = rand.nextInt(7) + 1;

        
        String colorName = colors[colorNumber - 1];

        System.out.println("Number: " + colorNumber + " | Color: " + colorName);
    }
}

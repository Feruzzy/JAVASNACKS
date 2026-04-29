public class ReverseArray {

public static void main(String[] args){

int[] numbers = {10, 5, 20, 8};
System.out.println("Reverse array is: " + java.util.Arrays.toString(reverseArray(numbers)));


}
public static int[] reverseArray(int[] array) {
       
int[] reversed = new int[array.length];
       
      
int reversedIndexCounter = 0;
       
        
for (int originalIndexCounter = array.length - 1; originalIndexCounter >= 0; originalIndexCounter--) {
    reversed[reversedIndexCounter] = array[originalIndexCounter];
    reversedIndexCounter++; 
    }
    return reversed;
}
}

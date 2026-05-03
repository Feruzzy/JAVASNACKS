import java.util.Arrays;

public class ElementOnEvenPosition {

    public static void main(String[] args){

        int[] myArray = {10, 20, 30, 40, 50};


        int[] evenPositions = getElementsOnEvenPositions(myArray);
        System.out.println(Arrays.toString(evenPositions));

    }
    public static int[] getElementsOnEvenPositions(int[] array) {
       
        int resultSize = array.length / 2;
        int[] result = new int[resultSize];
               
        int resultIndexCounter = 0;
               
            
        for (int originalIndexCounter = 1; originalIndexCounter < array.length; originalIndexCounter = originalIndexCounter + 2) {
            result[resultIndexCounter] = array[originalIndexCounter];
            resultIndexCounter++;
        }
        return result;
    }
}



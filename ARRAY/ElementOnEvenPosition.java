import java.util.Arrays;

public class ElementOnEvenPosition {

    public static void main(String[] args){

        int[] myArray = {10, 20, 30, 40, 50};


        int[] evenPositions = computeRunningTotal(myArray);
        System.out.println(Arrays.toString(evenPositions));

    }
     public static int[] computeRunningTotal(int[] array) {
        int[] runningTotalArray = new int[array.length];
        int sumSoFar = 0;
       
        for (int indexCounter = 0; indexCounter < array.length; indexCounter++) {
            sumSoFar = sumSoFar + array[indexCounter]; // Add current element to total.
            runningTotalArray[indexCounter] = sumSoFar; // Put running total in the new array.
        }
        return runningTotalArray;
    }

    }
}



import java.util.Arrays;

public class Total {

    public static void main(String[] args){

        int[] myArray = {10, 20, 30, 40, 50};


        int[] runningTotal = computeRunningTotal(myArray);
        System.out.println(Arrays.toString(runningTotal));

    }
     public static int[] computeRunningTotal(int[] array) {
        int[] runningTotalArray = new int[array.length];
        int sumSoFar = 0;
       
        for (int indexCounter = 0; indexCounter < array.length; indexCounter++) {
            sumSoFar = sumSoFar + array[indexCounter]; 
            runningTotalArray[indexCounter] = sumSoFar; 
        }
        return runningTotalArray;
    }

}




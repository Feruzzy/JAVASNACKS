 import java.util.Arrays;

public class ArrayConcatenator {

public static void main(String[] args){

    String[] first_colors = {"Red", "Green"};
    String[] second_colors = {"Blue", "Yellow", "Orange"};

    String[] results = concatenateTwoArrays(first_colors, second_colors);

    System.out.println("Combined Array: " + Arrays.toString(results));

}


public static String[] concatenateTwoArrays(String[] array1, String[] array2) {
        
        int newSize = array1.length + array2.length;
        String[] combinedArray = new String[newSize];
       
        int currentPositionCounter = 0;
       
       
        for (int index1 = 0; index1 < array1.length; index1++) {
            combinedArray[currentPositionCounter] = array1[index1];
            currentPositionCounter++;
        }
       
        
        for (int index2 = 0; index2 < array2.length; index2++) {
            combinedArray[currentPositionCounter] = array2[index2];
            currentPositionCounter++;
        }
       
        return combinedArray;
}
}

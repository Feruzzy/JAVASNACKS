import java.util.Arrays;

public class AlternateArrays {

public static void main(String[] args){

    String[] first_list = {"a", "b", "c"};
    String[] second_list = {"1", "2", "3"};

    String[] result = combineTwoArraysAlternate(first_list, second_list);


    System.out.println(Arrays.toString(result));

}


public static String[] combineTwoArraysAlternate(String[] array1, String[] array2) {
       
    String[] combinedArray = new String[array1.length * 2];
       
    int combinedIndexCounter = 0;
       
        
    for (int originalIndexCounter = 0; originalIndexCounter < array1.length; originalIndexCounter++) {
          
    combinedArray[combinedIndexCounter] = array1[originalIndexCounter];
    combinedIndexCounter++;
           
           
    combinedArray[combinedIndexCounter] = array2[originalIndexCounter];
    combinedIndexCounter++;
    }
    return combinedArray;
}
}

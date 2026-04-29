import java.util.Arrays;

public class NumberConverter {

public static void main(String[] args){

    int testNumber = 12345;

    int[] result = convertNumberToDigitArray(testNumber);

    System.out.println("Digit array: " + Arrays.toString(result));

}


public static int[] convertNumberToDigitArray(int inputNumber) {
        
    String numberAsString = String.valueOf(inputNumber);
       
       
    int[] digitArrayResult = new int[numberAsString.length()];
       
        
    for (int digitCounter = 0; digitCounter < numberAsString.length(); digitCounter++) {
    char currentDigitChar = numberAsString.charAt(digitCounter);
            
    int currentDigitInt = Character.getNumericValue(currentDigitChar);
            
    digitArrayResult[digitCounter] = currentDigitInt;
    }
    return digitArrayResult;
    }

}

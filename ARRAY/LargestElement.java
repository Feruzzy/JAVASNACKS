public class LargestElement { 

public static void main(String[] args){

int[] numbers = {10, 5, 20, 8};
System.out.println("Largest is: " + findLargestElement(numbers));


}

public static int findLargestElement(int[] array) {
       
int largestSoFar = array[0];

for (int counter = 1; counter < array.length; counter++) {
    if (array[counter] > largestSoFar) {
        largestSoFar = array[counter];
}
    }
    return largestSoFar;
}
}


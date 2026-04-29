public class ElementInAnArray {

public static void main(String[] args){

int[] numbers = {10, 5, 20, 8};
System.out.println("Does 20 exist: " + doesElementOccur(numbers, 20));


}

public static boolean doesElementOccur(int[] array, int elementToFind) {
        
for (int indexCounter = 0; indexCounter < array.length; indexCounter++) {
         
if (array[indexCounter] == elementToFind) {
    return true; 
    }
    }
    return false; 
}
}




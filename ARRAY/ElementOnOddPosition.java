public class ElementOnOddPosition {

public static void main(String[] args){

int[] myArray = {10, 20, 30, 40, 50};
printElementsOnOddPositions(myArray);

}


public static void printElementsOnOddPositions(int[] array) {
System.out.print("Elements on odd positions: ");
       
for (int indexCounter = 0; indexCounter < array.length; indexCounter = indexCounter + 2) {
System.out.print(array[indexCounter] + " ");
}
System.out.println();
}
}

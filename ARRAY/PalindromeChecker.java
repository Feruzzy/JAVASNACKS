public class PalindromeChecker {

public static void main(String[] args){

    String first_word = "madam";
    String second_word = "hello";

    System.out.println("Is '" + first_word + "' a palindrome? " + isPalindrome(first_word));
    System.out.println("Is '" + second_word + "' a palindrome? " + isPalindrome(second_word));



}


 public static boolean isPalindrome(String text) {
        
        int leftSideCounter = 0;
        int rightSideCounter = text.length() - 1;
       
       
        while (leftSideCounter < rightSideCounter) {
            if (text.charAt(leftSideCounter) != text.charAt(rightSideCounter)) {
                return false; 
            }
            
            leftSideCounter++;
            rightSideCounter--;
        }
        return true; 
}
}

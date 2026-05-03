import java.util.Scanner;

public class PhoneKeypad {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter string: ");
String s = input.next().toUpperCase();

for (char ch : s.toCharArray()) {
if (Character.isLetter(ch)) System.out.print(getNumber(ch));

else System.out.print(ch);
}
}


public static int getNumber(char ch) {
    if (ch >= 'W') return 9;
    if (ch >= 'T') return 8;
    if (ch >= 'P') return 7;
    if (ch >= 'M') return 6;
    if (ch >= 'J') return 5;
    if (ch >= 'G') return 4;
    if (ch >= 'D') return 3;
    return 2;
    }
}


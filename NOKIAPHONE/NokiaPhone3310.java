import java.util.Scanner;

public class NokiaPhone3310 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

mainLoop:
while (true) {
System.out.println("\nMAIN MENU");
System.out.println("1. Phone book\t 2. Messages\t 3. Chat");
System.out.println("4. Call register\t 5. Tones\t 6. Settings");
System.out.println("7. Call divert\t 8. Games\t 9. Calculator");
System.out.println("10. Reminders\t 11. Clock\t 12. Profiles");
System.out.println("13. SIM services\t 0. Exit");
System.out.print("Select: ");

String mainChoice = input.nextLine();

switch (mainChoice) {
case "1": 
while (true) {
System.out.println("\nPHONE BOOK");
System.out.println("1. Search\n 2. Service Nos\n 3.Add name\n 4. Erase\n 5. Edith\n 6. Assign tone\n 7. Send b'card\n 8. Options\n 9. Speed dials\n 10. Voice tags\n 0. Back");
String pbChoice = input.nextLine();
if (pbChoice.equals("0")) break; 
if (pbChoice.equals("8")) {
System.out.println("1. Type of view\n 2. Memory status\n 0. Back");
input.nextLine();
}
}
break;

case "2": 
while (true) {
System.out.println("\nMESSAGES");
System.out.println("1. Write messages\n 2. Inbox\n 3. Outbox\n 4. Picture messages\n 5. Templates\n 6. Smileys\n 7. Message settings\n 8. Info service\n 9. Voice mailbox number\n 10. Service command\n 0. Back");
String msgChoice = input.nextLine();
if (msgChoice.equals("0")) break;
if (msgChoice.equals("7")) {
System.out.println("1. Set 1\n 2. Common\n0. Back");
String setChoice = input.nextLine();

if (setChoice.equals("1")) {
System.out.println("1. Message centre No\n 2. Memory sent as\n 3. Message\n 0. Back");

if (setChoice.equals("2")) {
System.out.println("1. Delivery report\n 2. Reply via same centre\n 3. Character support\n 0. Back");
input.nextLine();
}
}
}
}
break;

case "4": 
while (true) {
System.out.println("\nCALL REGISTER");
System.out.println("1. Missed calls\n 2. Received calls\n 3. Dialled numbers\n 4.Erase recent calls lists\n 5. Show call duration\n 6. Show call Costs\n 7. Call cost settings\n 8. Prepaid credit\n 0. Back");
String crChoice = input.nextLine();

if (crChoice.equals("0")) break;
switch (crChoice) {
case "5": System.out.println("1. Last call duration\n 2. All calls duration\n 3. Received calls duration\n 4. Dialled calls duration\n 5. Clear timers"); break;
case "6": System.out.println("1. Last call cost\n 2. All calls cost\n 3. Clear counters"); break;
case "7": System.out.println("1. Call cost limit\n 2. Show costs in"); break;
}
input.nextLine();
}
break;

case "5": 
while (true) {
System.out.println("TONES");
System.out.println("1. Ringing tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composure\n 5. Message alert tone\n 6. Keypad tones\n 7. warning and game tones\n 9. Screen saver\n 0. Back");
if (input.nextLine().equals("0")) break;

}
break;

case "6": 
while (true) {
System.out.println("\nSETTINGS");
System.out.println("1. Call settings\n 2. Phone settings\n 3. Security settings\n 4. Restore factory settings\n 0. Back");
String crChoice = input.nextLine();

if (crChoice.equals("0")) break;
switch (crChoice) {
case "1": System.out.println("1. Authomatic redial\n 2. Speed dialing\n 3. Call waiting options\n 4. Own number sending\n 5. Phone line in use\n 6. Automatic answer"); break;
case "2": System.out.println("1. Language\n 2. Cell info display\n 3. Welcome note\n 4. Network selection\n 5. Light\n 6. Confirm SIM service actions"); break;
case "3": System.out.println("1. PIN code request\n 2. Call barring service\n 3. Fixed dialling\n 4. Closed user group\n 5. Phone security\n 6. Change access code"); break;
}
input.nextLine();
}
break;

case "11": // Clock
while (true) {
System.out.println("\nCLOCK");
System.out.println("1. Alarm clock\n 2. Clock settings\n 3. Date setting\n 4. Stop watch\n 5. Countdown timer\n 6. Auto update of date and time\n 0. Back");
if (input.nextLine().equals("0")) break;
                    
}
break;

case "3": case "7": case "8": case "9": case "10": case "12": case "13":
System.out.println("Menu " + mainChoice + " opened. Press Enter to go back.");
input.nextLine();
break;

case "0":
System.out.println("Powering off...");
break mainLoop; // This breaks the labeled loop and ends the program

default:
System.out.println("Invalid selection.");
break;
            
}
}
}
}

import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password = "elephant";

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA");
    //Study Drill
    System.out.println("ENTER YOUR PASSWORD: ");
    password = keyboard.next();

    while (! password.equals("elephant")) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD:");
      password = keyboard.next();
    }
    //End Study Drill
    System.out.println("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
/* Study Drill
1. Before you ask the person for a PIN, ask them for a password.
(It should be a String.) Then add a second while loop before the first
one that loops as long as their answer is not the right password.
So after you’re done, the person must enter the correct password
and then enter the correct PIN in order to see their account balance.
Remember that you need to use .equals() when comparing Strings,
and “not equals” looks like this:
( ! typedPassword.equals("hunter2") )
The exclamation point in front there means “not” or “the opposite of”.

*/

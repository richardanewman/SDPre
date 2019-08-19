import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println("Type the word \"weasel\", please.");
    word = keyboard.next();

    yep = "weasel".equals(word);
    nope = ! word.equals("weasel");

    System.out.println("You typed what was requested: " + yep);
    System.out.println("You ignored polite instructions: " + nope );
  }
}
////////////////////Study Drills/////////////////////////
/*1. Try changing around the comparison on line 12 so that "weasel" is in front
 of the dot and the variable word is inside the parentheses. Make sure that
  "weasel" is still surrounded by quotes and that word is not. Does it work?

  Yes, it still works.
*/

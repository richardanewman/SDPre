import java.util.Scanner;

public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;
//Begin Study Drill
    System.out.println("Welcome to CoinFlip!");
    System.out.println("Are you ready to flip? (y/n)?");
    again = keyboard.next();

    while (again.equals("y")) {
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flipped... " + coin);

      if (gotHeads) {
        streak++;
        System.out.println("That's " + streak + " in a row!");
        System.out.println("Would you like to flip again? (y/n)? ");
        again = keyboard.next();
      }
      else {
        System.out.println("You lost! ");
        System.out.println("Should've quit while you were aHEAD! ");
        streak = 0;
        again = "n";
      }
    }
    System.out.println("Final score: " + streak);
//End Study Drill

/* original do while loop from exercise 29
    do {
      gotHeads = Math.random() < 0.5;

      if (gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flip a coin and it is... " + coin);

      if (gotHeads) {
        streak++;
        System.out.println("\tThat's " + streak + " in a row....");
        System.out.print("\tWould you like to flip again (y/n)? ");
        again = keyboard.next();
      }
      else {
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD...");
        streak = 0;
        again = "n";
      }
    } while (again.equals("y"));
    System.out.println("Final score: " + streak);
*/
  }
}
/* Study Drill
1. Change the code so that it uses a while loop instead of a do-while loop.
Make sure it compiles and works the same.

A: ln 9-38

2. Change it back to a do-while loop. (You might look back at this code
later when you forget how to write a do-while loop and we don’t want your
only example to have been changed to a while loop.)

A: I just commented out the original code and left my own while loop active

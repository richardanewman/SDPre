import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main(String[] args) {
    printTopHalf();

    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
    printPledge();
  }

  public static void print48Colons() {
    out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
  }

  public static void print48Ohs() {
    out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons() {
    out.println("|:::::::::::::::::::::::::::::|");
  }

  public static void printPledge() {
    out.println("I pledge allegiance to the flag.");
  }

  public static void print29Ohs() {
    out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print6Stars() {
    out.print("| *  *  *  *  *  * ");
  }

  public static void print5Stars() {
    out.print("|  *  *  *  *  *   ");
  }

  public static void printSixStarLine() {
    print6Stars();
    print29Ohs();
  }

  public static void printFiveStarLine() {
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf() {
    out.println(" ________________________________________________");

    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }

}
/* Study Drills
1. This is mean, but I’m going to make you trace through the whole program.
Print out the code, grab a pencil, and draw lines whenever a function calls
somewhere else and draw a line back when the function returns. When you are
done it should look a bit like a plate of graphite spaghetti! If you watch
the Study Drill video I trace through the entire thing with you.


2. On lines 27 through 29 you find a definition for a function named
printPledge(). But yet the output of this function never shows up. Why not?
At the end of main() add a function call to run this function so that it
shows up underneath the flag.

*/

public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor();
    System.out.println("Back first time.");
    erebor();
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println("There.");
  }
}
/* Study Drills
1. Remove the parentheses at the end of the first function
call on line 4 so that it looks like so:

erebor;

What happens when you compile? (Then put the parentheses back.)

A: Will not compile. ThereAndBackAgain.java:4: error: not a statement
    erebor;
    ^
1 error


2. Remove the second function call (the one on line 6). You can
either just delete the line entirely or put slashes in front of
it so the compiler thinks it’s a comment like so:

// erebor();

Compile it, but before you run it, how do you think the output
will be different? Run it and see if you were right.

A: Just keeps the call from running.

*/

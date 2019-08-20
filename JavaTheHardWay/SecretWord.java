import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;

    System.out.print("What's the secret word? ");
    guess = keyboard.next();

    if (guess.equals(secret) || guess.equals("apple")) {
      System.out.println("That's correct!");
    }
    else {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }

    //if (guess == secret) {
      //System.out.println("(This will never ever show, no matter what.)");
    //}
      /*The if statement above will never work because of the following:
      I can’t really explain why without going into way too much detail,
      but it has to do with the fact that == only compares the shallow values
      of the variables, and the shallow values of two Strings are only equal
      when they refer to the same memory location.) What does work is using
      the .equals() method (which compares the deep values of the variables
      instead of their shallow values). This will be true if they type the
      correct secret word.

      Study Drills
      1. Pick a second secret word that will also work.Then add an OR to the
      first if statement so that typing EITHER word makes it print out
      “That’s correct!”. For example, if I wanted the new secret word to be
      “mogul”, I could change the if statement to look like this:
        if ( guess.equals(secret) || guess.equals("mogul") ) {

        Pick a different word for yours, though.

      A: "apple"


      */

  }
}

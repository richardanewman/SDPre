import java.util.Scanner;

public class HighLow {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(100*Math.random());

    System.out.println("I'm thinking of a number between 1-100.");
    System.out.println("Try to guess it!");
    System.out.print("> ");
    guess = keyboard.nextInt();

    while (secret != guess) {
      if (guess < secret) {
        System.out.print("Sorry, your guess is too low.");
        //System.out.print(" Try again. \n> ");
        //guess = keyboard.nextInt();
      }
      if (guess > secret) {
        System.out.print("Sorry your guess is too high.");
        //System.out.print(" Try again. \n> ");
        //guess = keyboard.nextInt();
      }
      System.out.print(" Try again. \n> ");
      guess = keyboard.nextInt();
    }
    System.out.println("You guessed it! What are the odds!?");
  }
}
/* Study Drill
1. This code should be shorter! Notice that lines 18 and 19 are identical
to lines 22 and 23. This is silly; there’s no reason to write the same
code in both if statements.
Make it so there is only one copy of these two lines and put if after both
if statements (but still inside the body of the while loop).
Confirm that the program still works. When testing programs like this,
I usually cheat by adding code to print out the value of the secret number
before my first guess. Then, once I’m certain that everything works fine I
take the code back out.

*/

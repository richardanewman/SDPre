import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.println("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");
    //Begin Study Drill
    current = keyboard.nextInt();

/*
    //Begin Study Drill
    while (current != 0) {
      total += current;
      System.out.println("The total so far is: " + total);
      System.out.print("Value: ");
      current = keyboard.nextInt();


    }

    System.out.println("The final total is: " + total);
    //End Study Drill
*/
// original code from exercise 30
    do {
      total += current;
      System.out.println("The total so far is: " + total);
      System.out.print("Value: ");
      current = keyboard.nextInt();
    } while (current != 0);

    System.out.println("The final total is: " + total);

  }
}
/* Study Drills
1. Rewrite the code to use a while loop instead of a do-while loop.
(It won’t compile at first.) Add/change something before the loop
starts so that it compiles and make sure it still works. Then change
it back to a do-while. (And leave in whatever you changed to make the
while version compile.)

2. When the human types in a zero to end the program, it prints
“The total so far” and then prints “The final total” right afterward.
That looks awkward, so fix the code so that it skips printing
“The total so far” if the loop is about to end. Make sure it still
prints it the rest of the time, though.

*/

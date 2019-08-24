import java.util.Scanner;

public class CountingFor {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n;
    String message;

    System.out.println("Enter a message and I'll display it five times.");
    System.out.print("Message: ");
    message = keyboard.nextLine();

    for (n = 1; n <= 5; n++) {
      System.out.println(n + ". " + message);
    }

    System.out.println("\nNow I'll show it ten time and count by 5s.");
    for (n = 5; n <= 50; n += 5) {
      System.out.println(n + ". " + message);
    }

    System.out.println("\nFinally, three times counting backward.");
    for ( ; n > 0; n -= 1 ) {
      System.out.println(n + ". " + message);
    }
  }
}
/* Study Drills
1. Delete the first part (theinitialization statement) from the third loop.
If you remove it correctly, it will still compile. What happens when you run it?

A: It only compiles if you leave a semicolon and runs from the last instance of
n, which is from the previous statement's last update expression n++ (n = 55).
The loop starts at 55 and counts down by 1.


//Notes:
for (n = 1; n <= 5; n++)

n = 1; The initialization expression initializes the loop; it's executed once,
as the loop begins.

n <= 5; When the termination expression evaluates to false, the loop terminates.

n++; The increment expression is invoked after each iteration through the loop;
it is perfectly acceptable for this expression to increment or decrement a value.

*/

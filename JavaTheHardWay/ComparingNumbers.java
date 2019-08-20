import java.util.Scanner;

public class ComparingNumbers {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

    if (first < second)
      System.out.println(first + " is LESS THAN " + second);

    if (first <= second)
      System.out.println(first + " is LESS THAN/EQUAL TO " + second);

    if (first == second)
      System.out.println(first + " is EQUAL TO " + second);

    if (first >= second)
      System.out.println(first + " is GREATER THAN/EQUAL TO " + second);

    if (first > second)
      System.out.println(first + " is GREATER THAN " + second);

    if (first != second) {
      System.out.println(first + " is NOT EQUAL TO " + second);
      System.out.println("Hey.");
    }
  }
}
/* Study Drills
1. Add another line of code after line 29 that says System.out.println( "Hey." );.
Indent it so that it lines up with the println() statement above it, like so:

if ( first != second )
System.out.println( first + " is NOT EQUAL TO " + second );
System.out.println( "Hey." );

Run the program, and see what happens. Is the “Hey” part of the if statement body?
That is, when the if statement is skipped, is the “Hey” skipped, too, or does it
run no matter what? What do you think?

A: I expected "Hey." to not print but it is there.

2. Add curly braces around the body of the final if statement so that the “Hey”
line is part of the body. Then remove all the other if statement body curly
braces so that only the last if statement in the program has them.
Confirm that everything works as expected.

A: Removed the curly braces from all but the last if statement and the program still
runs as expected. 



*/

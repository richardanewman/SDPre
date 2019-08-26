public class NestingLoops {
  public static void main(String[] args) {

    for (int n = 1; n <= 3; n++) {
      for (char c = 'A'; c <= 'E'; c++) {
        System.out.println(n + " " + c);
      }
    }
    System.out.println("\n");


    for (int a = 1; a <= 3; a++) {
      for (int b = 1; b <= 3; b++) {
        System.out.print("(" + a + "," + b + ")");
      }
      System.out.println();
    }
    System.out.println("\n");
  }
}
/* Study Drills

1. Look at the first set of nested loops (“CN”). Which variable changes faster?
Is it the variable controlled by the outer loop (c) or the variable controlled
by the inner loop (n)?

A: The inner loop changes faster.

2. Change the order of the loops so that the “c” loop is on the inside and the
“n” loop is on the outside. How does the output change?

A: Inner loop still executes faster but because the print statement is unchanged
it makes it appear as though it's the opposite. Changing the print statement
shows that the outer loop in fact still executes slower than the inner.

3. Look at the second set of nested loops (“AB”). Change the print() statement
to println(). How does the output change? (Then change it back to print().)

A: Prints vertically, each on their own line.

4. Add a System.out.println() statement where indicated (after the close brace
of the inner loop (the “b” loop), but still inside the outer loop). How does
the output change?

A: Prints three to a line. (1,1)(1,2)(1,3)

*/

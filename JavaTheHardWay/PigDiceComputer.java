public class PigDiceComputer {
  public static void main(String[] args) {
    int roll, total;
    total = 0;

    do {
      roll = 1 + (int)(Math.random()*6);
      System.out.println("Computer rolled a " + roll + ".");
      if (roll == 1) {
        System.out.println("\tThat ends its turn.");
        total = 0;
      }
      else {
        total += roll;
        System.out.print("\tComputer has " + total);
        System.out.print(" points so far this round.\n");
        if (total < 20) {
          System.out.println("\tComputer will roll again.");
        }
      }
    } while (roll != 1 && total < 20);
    System.out.println("Computer ends the round with " + total + " points.");
  }
}
/* Study Drills
1. Find a dice (technically it should be “die”, since “dice” is plural and
you only need one) or find an app or website to simulate rolling a die. Get
out a sheet of paper and something to write with. Draw a line down the middle
of the paper and make two columns. Label the left column “roll” and the right
column “total”. Put a 0 in the total column and leave the other column blank
at first.

Then roll the die and write down the number you rolled at the top of the roll
column. Put the number (7) in parentheses next to the roll value, since the
die roll occurs on line 7 in the code.

Then step through the code line by line just like the computer would. Compare
the current value of roll with 1. If they are equal, cross out the current
value in the total column and put 0 (11) there, since total would become zero
on line 11 of the code.

Keep going until the program would end. Here’s an example of what my table
would look like for the sample run of the program shown in the “What You
Should See” section.
roll total
0 (4) 2 (7)
2 (14) 3 (7)
5 (14) 1 (7)
0 (11)

*/

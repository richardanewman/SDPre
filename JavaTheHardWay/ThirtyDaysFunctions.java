import java.util.Scanner;

/**
 * Contains functions that make it easier to work with months.
 */
public class ThirtyDaysFunctions {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.print("Which month? (1-12) ");
    int month = kb.nextInt();

    System.out.println(monthDays(month) + " days hath " + monthName(month));
  }

  /**
   * Returns the name for the given month number (1-12).
   *
   * @author  Graham  Mitchell
   * @param   month   the month (1-12)
   * @return          the English name of the month, or "error" if out of range
   */
  public static String monthName(int month) {
    String monthName = "error";

    if (month == 1)
      monthName = "January";
    else if (month == 2)
      monthName = "February";
    else if (month == 3)
      monthName = "March";
    else if (month == 4)
      monthName = "April";
    else if (month == 5)
      monthName = "May";
    else if (month == 6)
      monthName = "June";
    else if (month == 7)
      monthName = "July";
    else if (month == 8)
      monthName = "August";
    else if (month == 9)
      monthName = "September";
    else if (month == 10)
      monthName = "October";
    else if (month == 11)
      monthName = "November";
    else if (month == 12)
      monthName = "December";

    return monthName;
  }
  /**
}  * Returns the number of days in a given month.
   *
   * @author  Graham  Mitchell
   * @param   month  the month number (1-12)
   * @return          the number of days in the month, or 31 if out of range
   */
   public static int monthDays(int month) {
     int days;

     /* Thirty days hath September
        April, June and November
        All the rest have thirty-one
        Except the second month alone.... */
      switch(month)
      {
        case  9:
        case  4:
        case  6:
        case 11:  days = 30;
                  break;
        case  2:  days = 28;
                  break;
        default:  days = 31;
      }
      return days;
   }
}
/* Study Drill
1. Look at the javadoc documentation for one of the built-in Java classes:
java.util.Scanner. Notice how similar it looks to what the javadoc tool
generated? All the official Java documentation is created using the javadoc
tool, so learning how to read it will be an important part of becoming an
expert Java programmer. Don’t worry too much about the details right now,
though. Just try to get a feel for how it looks.

In the upper left is a list of all the packages of code that are included
as part of Java and below that on the left is a list of all the classes/
libraries you could import to save you from having to write code. A big
part of what professional Java programmers do is write code to glue together
existing Java libraries.

This is probably overwhelming right now. That’s fine because you have just
started. Hopefully no one expects you to understand much about this yet. In
fact, most programmers only know about a fraction of the built-in Java
libraries, and they search on the Internet and read the documentation when
they need to do something new, just like you do!

http://docs.oracle.com/javase/7/docs/api/index.html?java/util/Scanner.html

*/

import java.util.Scanner;

public class GenderTitles {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String title = "error";

    System.out.print("First name: ");
    String first = keyboard.next();
    System.out.print("Last name: ");
    String last = keyboard.next();
    System.out.print("Gender (M/F): ");
    String gender = keyboard.next();
    System.out.print("Age: ");
    int age = keyboard.nextInt();

    if (age < 20) {
      title = first;
    }
    else {
      if (gender.equals("F")) {
        System.out.print("Are you married, " + first + "? (Y/N): ");
        String married = keyboard.next();
        if (married.equals("Y")) {
          title = "Mrs.";
        }
        else {
          title = "Ms.";
        }
      }
      else {
        title = "Mr.";
      }
    }
    System.out.println("\n" + title + " " + last);
  }
}
/* Study Drills
1. Change the else on line 31 to a suitable if statement instead, like:

if ( gender.equals("M") )

Notice that the program doesn’t compile anymore. Can you figure out why?
It is because the variable title is declared on line 6 but is not given a
value right away. Then on line 36, the value of title is printed on the
screen. The variable must have a value at this point, or we will be trying
to display the value of a variable that is undefined: it has no value. The
compiler wants to prevent this.

When line 31 was an else, the compiler could guarantee that no matter what
path through the nested if statements was taken, title would always get a
value. Once we changed it to a regular if statement, there is now a way the
human could type something to get it to sneak through all the nested if
statements without giving title a value. Can you think of one?

(They could type an age 20 or greater and a letter different than "M" or "F"
when prompted for gender. Then neither gender if statement would be true.)

We can fix this by changing the if statement back to else (probably a good idea)
or by initializing title right when we declare it (probably a good idea anyway):

String title = "error";

...or something like that. Now title has a value no matter what, and the compiler
is happy.



*/

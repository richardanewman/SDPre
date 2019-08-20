import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println("Welcome to the UT Austin College Admissions Interface!");
    out.print("Please enter your SAT math score (200-800): ");
    math = keyboard.nextInt();

    out.print("Admittance status: ");

    if (math >=790)
      out.print("CERTAIN ");
    else if (math >= 710)
      out.print("SAFE ");
    else if (math >= 580)
      out.print("PROBABLE ");
    else if (math >= 500)
      out.print("UNCERTAIN ");
    else if (math >= 390)
      out.print("UNLIKELY ");
    else
      out.print("DENIED ");
    out.println();
  }
}
/* Study Drills
1. In the original code file (CollegeAdmission.java), remove all the elses
except for the last one. Run it and notice how it prints all the messages.
Then put the elses back.

A: It prints: Welcome to the UT Austin College Admissions Interface!
Please enter your SAT math score (200-800): 730
Admittance status: SAFE PROBABLE UNCERTAIN UNLIKELY

2. Move lines 23 and 24 so they appear between lines 16 and 17. Compile it
and run it and notice how the program almost always just says "UNLIKELY"
because most SAT scores are more than 390 and the if statement is so high
in the list that it steals the show most of the time.

A: Yes, I understand.

3. If you really don’t trust me, type in the code for CollegeAdmission
Expanded.java and confirm that it works the same as the non-expanded version

A: Got it.



*/

import java.util.Scanner;
import java.util.Calendar;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear, birthday, yes, no;
    currentYear = Calendar.getInstance().get(Calendar.YEAR);

    Scanner birthdayInput = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("Have you celebrated your birthday? Answer 0 for yes or 1 for no only.");
    birthday = birthdayInput.nextInt();

    birthYear = (currentYear - age) - birthday;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}

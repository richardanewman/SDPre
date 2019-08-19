import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age, rating;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");


    System.out.println("Before you go, please rate your experience with this program on a scale between 1-5.");
    System.out.print("1 being the worst and 5 being the best. ");
    rating = keyboard.nextInt();

    System.out.println(rating + "! So that's how you feel, " + name + ". Thanks! Have a great day.");
  }
}

/////////////////////////////Study Drills////////////////////////////
//1. No, it does not throw an error because a double can be an int or float.
//2. No, it does not throw an error when entering a numeric value into a string field.
//3. String errors when entering a calculation. Int/double errors entering a string.
//4. See lines 31-35

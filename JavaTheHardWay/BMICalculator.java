import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double heightFeet, heightInches, lbs, m, kg, bmi;


    System.out.println("Please enter your height in feet only and then remaining inches only.");
    System.out.println("For example: 6' 1\" would be \"Your height (feet only):\" 6\"");
    System.out.println("Next you would enter \"Your height (inches only):\" 1");
    System.out.print("Plese enter your height in feet only: ");
    heightFeet = keyboard.nextDouble();

    System.out.print("Please enter the remaining inches of your height: ");
    heightInches = keyboard.nextDouble();

    m = ((heightFeet*12) + heightInches) / 39.37;

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();

    kg = lbs / 2.205;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}

import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double num1, num2, sum;

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");
    num1 = input.nextDouble();

    System.out.println("Please enter another number:");
    num2 = input.nextDouble();

    sum = num1 + num2;

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);


  }
}

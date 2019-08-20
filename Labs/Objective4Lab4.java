import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    int num = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number:");
    num = input.nextInt();

    if (num == 0) {
      System.out.println("You didn't enter a positive whole number.");
    }
    else if (num % 2 == 0) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }
  }
}

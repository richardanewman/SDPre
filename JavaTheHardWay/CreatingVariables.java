public class CreatingVariables {
  public static void main(String[] args){
    int x, y, z, age;
    double seconds, e, checking, savings;
    String firstName, lastName, title, greeting, message;

    x = 10;
    y = 400;
    z = 1000000;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    savings = 54336;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    greeting = "Hello!";
    message = "your savings balance is ";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println("The variable z contains the value " + z);
    System.out.println(greeting + " " + title + firstName + " " + lastName + " " + message + "$" + savings);
  }
}

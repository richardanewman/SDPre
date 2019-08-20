public class ClubBouncer {
  public static void main(String[] args) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
      System.out.println("You are allowed to enter the club.");
    }
    //System.out.println("Will this compile?");
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
/* Study Drills
1. Between lines 10 and 11, add a println() statement to print something on the
screen (it doesn’t matter what, but I put "C-C-C-COMBO BREAKER" because I’m weird.)
Try to compile the program. Does it compile? Why not?

A: It did not compile. ClubBouncer.java:12: error: 'else' without 'if'
    else {
    ^
1 error

*/

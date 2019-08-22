public class HeronsFormula {
  public static void main(String[] args) {
    double a, g;
    String tws = "A triangle with sides ";

    a = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3,3,3 has area " + a);

    a = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3,4,5 has area " + a);
    g = triangleArea(7, 8, 9);
    System.out.println(tws + "7,8,9 has area " + g);

    System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13));
    System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11));
    System.out.println(tws + "8,15,17 has area " + triangleArea(8, 15, 17));
    System.out.println(tws + "9,9,9 has area " + triangleArea(9, 9, 9));

  }

  public static double triangleArea( int a, int b, int c) {
    double s, A;

    s = (a+b+c) / 2.0;
    A = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    return A;
  }
}
/* Study Drills
1. Which one is longer, the version that uses a function or the one without?
Answer in a comment.

A: The one without a funtion.

2. There is a bug in the formula for both files. When(a+b+c) is an odd number,
dividing by 2 throws away the .5. Fix it so that instead of (a+b+c)/2 you have
(a+b+c)/2.0. How much harder would it have been to fix the version that didn’t
use a function?

A: Would have been more work to fix each line of code in a program without
a function.

3. Add one more test: find the area of a triangle with sides 9, 9, and 9.
Was it difficult to add? How much harder would it have been to add the test
to the version that didn’t use a function?


*/

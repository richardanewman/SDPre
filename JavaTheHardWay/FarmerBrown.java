public class FarmerBrown {
  public static void main(String[] args) {
    for (int s = 1; s <= 10; s++) {
      for (int g = 1; g <= 29; g++){
        for (int c = 1; c <= 98; c++) {
          if (s+g+c == 100 && 10.00*s + 3.50*g + 0.50*c == 100.00){
            System.out.print(s + " sheep, ");
            System.out.print(g + " goats, and ");
            System.out.print(c + " chickens.");
          }
        }
      }
    }
  }
}
/* Study Drill
1. Our code works, but it is not as efficient as it could be. (For example,
there is no reason to make the “sheep” loop try 11 or 12 or more sheep because
we can’t afford them.) See if you can change the loop bounds to make the
combinations less wasteful.

*/

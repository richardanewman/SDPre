public class Objective6Lab4 {
  public static void main(String[] args) {
    int count, sum;
    count = 1;
    sum = 0;

    while (count <= 20) {
      sum = sum + count;
      count = ++count;
    }
    System.out.println(sum);

  }
}

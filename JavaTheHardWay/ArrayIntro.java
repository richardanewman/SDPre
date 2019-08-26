public class ArrayIntro {
  public static void main(String[] args) {
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    String[] constellations = {"Orion", "Perseus", "Cassiopeia", "Gemini", "Taurus"};

    for (String p : planets) {
      System.out.println(p + "\t" + p.toUpperCase());
    }

    System.out.println("\n");

    for (String c : constellations) {
      System.out.println(c + "\t" + c.toUpperCase());
    }
  }
}
/* Study Drill

1. Create a second array of Strings and use an initializer list to put several
values into it. Then add a second foreach loop to display the values from the
new array on the screen, one at a time.

*/

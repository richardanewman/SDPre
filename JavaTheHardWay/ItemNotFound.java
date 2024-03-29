import java.util.Scanner;

public class ItemNotFound {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {
      "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
            "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
            "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
            "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"

    };
    String guess;
    boolean found;

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();
    found = false;
    int count = 0;
    for (String hero : heroes) {
      if (guess.equals(hero)){
        System.out.println("That's one of them!");
        found = true;
        //count = count + 1;
      }
    }
    if (found == false) {
      System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    }
//Study Drill
    //if (count == 0) {
      //System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    //}
  }
}
/* Study Drill
1. A different way to say that something is not in an array is to count the
number of matches. Then, when the loop is over if the counter is still zero,
you know it’s not there.
Either create a new array with different values or change some of the names
in the array of Greek mortal heroes so that there are some duplicates. Then
add a second for loop that uses a counter to determine if a value is found.
*/

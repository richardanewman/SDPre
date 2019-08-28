import java.util.Random;

class Card {
  int value;
  String suit;
  String name;

  public String toString() {
    return name + " of " + suit;
  }
}

public class PickACard {
  public static void main(String[] args) {
    Card[] deck = buildDeck();
    displayDeck(deck);
    shuffleDeck(deck);
    displayDeck(deck);

    int chosen = (int)(Math.random()*deck.length);
    Card picked = deck[chosen];

    System.out.println("You picked a " + picked + " out of the deck,");
    System.out.println("worth " + picked.value + " points in Blackjack.");
  }

  public static Card[] buildDeck() {
    String[] suits = { "clubs", "diamonds", "hearts", "spades" };
    String[] names = { "ZERO", "ONE", "two", "three", "four", "five", "six",
                      "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace" };

    int i = 0;
    Card[] deck = new Card[52];

    for (String s: suits) {
      for (int v=2; v <=14; v++) {
        Card c = new Card();
        c.suit = s;
        c.name = names[v];
        if ( v == 14)
            c.value = 11;
        else if ( v > 10)
            c.value = 10;
        else
            c.value = v;

        deck[i] = c;
        i++;
      }
    }
    return deck;
  }

  public static void displayDeck(Card[] deck) {
    for (Card c : deck)
      System.out.println(c.value + "\t" + c);
  }
  public static void shuffleDeck(Card[] deck) {
    System.out.println("\n\n...shuffling the deck...\n\n");
    //Fisher Yates/Knuth shuffle
    Random random = new Random();
    int d = deck.length;
    for (int i = d - 1; i >= 1; i--) {
      int j = random.nextInt(i + 1);
      swap(deck, i, j);
    }
    }
  private static void swap(Card[] deck, int i, int j) {
      Card temp = deck[i];
      deck[i] = deck[j];
      deck[j] = temp;
    }



  }

/* Study Drill
1. Add a function called shuffleDeck(). It should take in an array of cards
as a parameter and return nothing (void). One way to shuffle26 is to choose
two random numbers from 0-51 and “swap” the cards in those slots. Then put
that code in a loop that repeats 1000 times or so. This is a bit tricky to
get right.

*/

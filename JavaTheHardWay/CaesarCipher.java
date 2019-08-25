import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
  /**
   * Returns the character shifted by the given number of letters.
   */
  public static char shiftLetter(char c, int n) {
    int u = c;

    if (! Character.isLetter(c))
        return c;

    u = u + n;
    if (Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z') {
      u -= 26;
    }
    if (Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a') {
      u += 26;
    }

    return (char)u;
  }

  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String plaintext, cipher = "";
    int shift;


    Scanner fileIn = new Scanner(new File("message-in.txt") );
    plaintext = fileIn.nextLine();
    System.out.print("Shift (0-26): ");
    shift = keyboard.nextInt();
    fileIn.close();

    System.out.println("Encrypting file...");
    //System.out.print("Message: ");
    //plaintext = keyboard.nextLine();
    //System.out.print("Shift (0-26): ");
    //shift = keyboard.nextInt();

    for (int i=0; i<plaintext.length(); i++) {
      cipher += shiftLetter(plaintext.charAt(i), shift);
    }
    //System.out.println(cipher);
    PrintWriter out = new PrintWriter("message-out.txt");
    out.println(cipher);
    out.close();
  }
}
/* Study Drills
1. Modify the code to read the plaintext message from a text file instead of
letting the human type it in. Then, instead of just displaying the ciphertext
on the screen, add code to store the ciphertext into a file.



//Notes:
String literals in the code are enclosed in double quotes like "Axe", while
char literals in the code are in single quotes like 'A'.

*/

import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest {
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    String pw, hash;

    MessageDigest digest = MessageDigest.getInstance("SHA-256");

    System.out.print("Password: ");
    pw = keyboard.nextLine();

    digest.update(pw.getBytes("UTF-8"));
    hash = DatatypeConverter.printHexBinary(digest.digest());

    System.out.println(hash);
  }
}
/* Study Drills
1. Look at the javadoc documentation for all the methods used in this exercise:
getInstance, getBytes, update, digest, and printHexBinary. Look at what arguments
they expect and look at the types of values they will return.

2. Remove the throws Exception from the end of line 6. Try to compile it.
(Then put it back.) You will learn a tiny bit about exceptions in the next
exercise.

*/

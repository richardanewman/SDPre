import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Scanner;


public class ReceiptRevisitedException {
  public static void main(String[] args) {
    PrintWriter fileout;
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter forDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    Scanner input = new Scanner(System.in);
    String formattedDate = dateTime.format(forDateTime);
    double gasPrice, numGallons, total;
    gasPrice = 2.81;

    System.out.println("Current fuel price is $2.81.");
    System.out.println("How many gallons would you like to buy?");
    numGallons = input.nextDouble();

    total = gasPrice * numGallons;

    try {
        fileout = new PrintWriter("exception_receipt.txt");
    }
    catch (IOException err) {
      System.out.println("Sorry, I can't open 'exception_receipt.txt' for writing.");
      System.out.println("Maybe the file exists and is read-only?");
      fileout = null;
      System.exit(1);
    }

    fileout.println( "+------------------------+" );
    fileout.println( "|                        |" );
    fileout.println( "|      CORNER STORE      |" );
    fileout.println( "|                        |" );
    fileout.println( "| " + formattedDate + "    |" );
    fileout.println( "|                        |" );
    fileout.println( "| Gallons:       " + numGallons + "    |" );
    fileout.println( "| Price/gallon: $" + gasPrice + "    |" );
    fileout.println( "|                        |" );
    fileout.println( "| Fuel total:  $" + formatter.format(total) + "   |" );
    fileout.println( "|                        |" );
    fileout.println( "+------------------------+" );
    fileout.close();
  }

}
/* Study Drill
1. Hey, you know how to work with variables! Pick a price per gallon and put
it into a double variable, then let the human enter in how many gallons of
gas they want. Figure out the total cost.

Then print the receipt to the file, but substitute their details so the file
will look different depending on what they put in. I would remove the bars
on the right side of the receipt, since making things line up would be hard.

*/

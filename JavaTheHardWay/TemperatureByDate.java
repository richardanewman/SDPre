import java.util.Scanner;
import java.io.File;

class TemperatureSample {
  int month, day, year;
  double temperature;
}

public class TemperatureByDate {
  public static void main(String[] args) throws Exception {
    //String site = "https://learnjavathehardway.org";
    //String path = "/txt/avg-daily-temps-with-dates-atx.txt";
    //Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());
    Scanner localFile = new Scanner(new File("il-chicago.txt"));
    TemperatureSample[] tempDB = new TemperatureSample[10000];
    int numRecords, i=0;

    while (localFile.hasNextInt() && i < tempDB.length) {
      TemperatureSample e = new TemperatureSample();
      e.month = localFile.nextInt();
      e.day   = localFile.nextInt();
      e.year  = localFile.nextInt();
      e.temperature = localFile.nextDouble();
      if (e.temperature == -99)
          continue;
      tempDB[i] = e;
      i++;
    }
    localFile.close();
    numRecords = i;

    System.out.println(numRecords + " daily temperatures loaded.");

    double total = 0, avg;
    int count = 0;
    for (i=0; i<numRecords; i++) {
      if (tempDB[i].month == 11) {
        total += tempDB[i].temperature;
        count++;
      }
    }

    avg = total / count;
    avg = roundToOneDecimal(avg);
    System.out.print("Average daily temperature over " + count);
    System.out.println(" days in November: " + avg);

    double highest = 0;
    int febCount = 0;
    for (i=0; i<numRecords; i++) {
      if (tempDB[i].month == 2) {
        if (tempDB[i].temperature > highest)
          highest = tempDB[i].temperature;
          febCount++;
      }
    }
    System.out.print("The highest temperature recorded for the month of February");
    System.out.println(" over " + febCount + " days is " + highest + " degrees fahrenheit. ");

  }

  public static double roundToOneDecimal(double d) {
    return Math.round(d*10)/10.0;
  }
}
/* Study Drills
1. Visit the University of Dayton’s temperature archive and download a file
with temperature data for a city near you! Make your code read data from
that file instead.

A: Changed the code to read from a local file of data from Chicago.

2. Change the code to find out other things, like the highest temperature
in February or whatever suits your fancy.

A: lns 48-58

3. Try printing an entire TemperatureSample record on the screen. Something
like this:

TemperatureSample ts = tempDB[0];
System.out.println( ts );

Notice that isn’t printing an integer like ts.year or a double like
ts.temperature; it is attempting to display a whole record on the screen.
Compile and run the file. What gets displayed on the screen?

A: Just the memory location TemperatureSample@6bc7c054

*/

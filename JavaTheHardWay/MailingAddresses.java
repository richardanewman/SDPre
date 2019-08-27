class Address {
  String street;
  String city;
  String state;
  int zip;
}

public class MailingAddresses {
  public static void main(String[] args) {
    Address uno, dos, tres, quatro;

    uno = new Address();
    uno.street  = "191 Marigold Lane";
    uno.city    = "Miami";
    uno.state   = "FL";
    uno.zip     = 33179;

    dos = new Address();
    dos.street  = "3029 Losh Lane";
    dos.city    = "Crafton";
    dos.state   = "PA";
    dos.zip     = 15205;

    tres = new Address();
    tres.street = "2693 Hannah Street";
    tres.city   = "Hickory";
    tres.state  = "NC";
    tres.zip    = 28601;

    quatro = new Address();
    quatro.street   = "123 Main Street";
    quatro.city     = "Chicago";
    quatro.state    = "IL";
    quatro.zip      = 60606;


    System.out.println(uno.street);
    System.out.println(uno.city + ", " + uno.state + " " + uno.zip);
    System.out.println("\n" + dos.street);
    System.out.println(dos.city + ", " + dos.state + " " + dos.zip);
    System.out.println("\n" + tres.street);
    System.out.println(tres.city + ", " + tres.state + " " + tres.zip);
    System.out.println("\n" + quatro.street);
    System.out.println(quatro.city + ", " + quatro.state + " " + quatro.zip);
  }
}
/* Study Drill
1. Create a fourth Address variable on line 10 and change the code to
put your mailing address in it. Don’t forget to print it out at the bottom.
*/

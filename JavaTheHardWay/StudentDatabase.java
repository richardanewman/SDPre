class Student {
  String name;
  int credits;
  double gpa;
}

public class StudentDatabase {
  public static void main(String[] args) {
    Student[] db;
    db = new Student[4];

    db[0] = new Student();
    db[0].name = "Esteban";
    db[0].credits = 43;
    db[0].gpa = 2.9;

    db[1] = new Student();
    db[1].name = "Dave";
    db[1].credits = 15;
    db[1].gpa = 4.0;

    db[2] = new Student();
    db[2].name = "Michelle";
    db[2].credits = 132;
    db[2].gpa = 3.72;

    db[3] = new Student();
    db[3].name = "Jen";
    db[3].credits = 112;
    db[3].gpa = 4.25;

    for (int i=0; i<db.length; i++) {
      System.out.println("Name: " + db[i].name);
      System.out.println("\tCredit hours: " + db[i].credits);
      System.out.println("\tGPA: " + db[i].gpa + "\n");
    }

    int maxLoc = 0;
    for (int i=1; i<db.length; i++)
      if (db[i].gpa > db[maxLoc].gpa)
          maxLoc = i;



    int fewest = 0;
    for (int i=1; i<db.length; i++){
      if (db[i].credits < db[fewest].credits){
          fewest = i;
      }

    }

    System.out.println(db[maxLoc].name + " has the highest GPA.");
    System.out.println(db[fewest].name + " has the fewest credits.");


  }
}
/* Study Drills
1. Change the array to have a capacity of 4 instead of 3. Change nothing
else and compile and run the program. Do you understand why the program
blows up?

A: Yes, the null pointer exception is because of the empty array we haven't
initialized yet.

2. Now add some more code to put values into the fields for your new
student. Give this new student a higher GPA than “Dave” and confirm that
the code correctly labels them as having the highest GPA.

A: Yes, works as expected.

3. Add code so that the program also finds the student with the fewest
credits.
A: lns 45-48 & 54
*/

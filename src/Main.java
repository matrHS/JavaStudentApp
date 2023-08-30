/**
 * Represents the application which can handle one or more students.
 * also calculates the average age
 *
 * @author Matthew
 * @version 2023-08-28
 */
public class Main {
  /**
   * Main method.
   *
   * @param args for the Main method
   */
  public static void main(String[] args) {
    // Press Alt+Enter with your caret at the highlighted text to see how
    // IntelliJ IDEA suggests fixing it.
    Student stud1 = new Student();
    Student stud2 = new Student("Matthew", 25, "062532");
    // Press Shift+F10 or click the green arrow button in the gutter to run the code.
    stud1.printInfo();
    stud2.printInfo();
    float avgAge = (stud1.getAge() + stud2.getAge()) / 2.0f;
    System.out.printf("The average age of the students is: " + avgAge);
  }
}
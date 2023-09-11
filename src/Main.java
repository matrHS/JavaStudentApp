/**
 * Represents the application which can handle one or more students.
 * also calculates the average age
 *
 * @author Matthew
 * @version 2023-08-28
 */
public class Main {

  /**
   * Method for printing student info to console.
   *
   * @param student to print info from
   */
  private static void printStudentInfo(Student student) {
    System.out.printf("\nName: " + student.getName()
            + " \nage: " + student.getAge()
            + " \nstudID: " + student.getStudentId() + "\n");

  }

  /**
   * Main method.
   *
   * @param args for the Main method
   */
  public static void main(String[] args) {


  }
}
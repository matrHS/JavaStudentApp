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
    StudentRegister studentRegister = new StudentRegister();

    studentRegister.addStudent(new Student("Matthew", 24, "000001"));
    studentRegister.addStudent(new Student("George", 58, "000042"));
    studentRegister.addStudent(new Student("Michael", 19, "062224"));

    System.out.println(studentRegister.getNumberOfStudents());
    for (int i = 0; i < studentRegister.getNumberOfStudents(); i++) {
      System.out.println(studentRegister.getStudentAt(i).getName());
    }
  }
}
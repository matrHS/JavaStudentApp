/**
 * Represents a student with name, age and studentID.
 *
 * @author Matthew
 * @version 2023-08-28
 */
public class Student {
  private String name;
  private int age;
  private String studentId;

  /**
   * Creates an instance of Student.
   */
  public Student() {
    name = "Joe";
    age = 18;
    studentId = "000000";
  }

  /**
   * Creates an instance of Student.
   *
   * @param studName Students name
   * @param studAge  Students age
   * @param studId   Students ID
   */
  public Student(String studName, int studAge, String studId) {
    name = studName;
    age = studAge;
    studentId = studId;
  }

  /**
   * gets student name.
   *
   * @return name of the student
   */
  public String getName() {
    return name;
  }

  /**
   * gets student age.
   *
   * @return age of the student
   */
  public int getAge() {
    return age;
  }

  /**
   * gets studentID.
   *
   * @return ID of the student
   */
  public String getStudentId() {
    return studentId;
  }

  /**
   * Changes the name of the student.
   *
   * @param newName is the new name of the student
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Sets the age of the student.
   * Age must be a positive number.
   *
   * @param newAge age to be set. Must be a positive number
   */
  public void setAge(int newAge) {
    if (newAge > 0) {
      age = newAge;
    }
  }

  /**
   * Sets the StudentID.
   *
   * @param newStudentId the ID to be set.
   */
  public void setId(String newStudentId) {
    studentId = newStudentId;
  }
}

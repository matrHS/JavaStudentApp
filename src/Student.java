/**
 * Represents a student with name, age and studentID.
 *
 * @author Matthew
 * @version 2023-08-28
 */
public class Student {
  private String name = "Joe";
  private int age = 0;
  private String studentId = "000000";

  /**
   * Creates an instance of Student.
   */
  public Student() {
    name = "Joe";
    age = 0;
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
    setName(studName);
    setAge(studAge);
    setId(studId);
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
    if (!newName.isEmpty()) {
      name = newName;
    }

  }

  /**
   * Sets the age of the student.
   * Age must be a positive number.
   *
   * @param newAge age to be set. Must be a positive number
   */
  public void setAge(int newAge) {
    age = Math.max(0, newAge);
  }

  /**
   * Sets the StudentID if it is equals to 6 character.
   *
   * @param newStudentId the ID to be set.
   */
  public void setId(String newStudentId) {
    if (newStudentId.length() == 6) {
      studentId = newStudentId;
    }

  }
}

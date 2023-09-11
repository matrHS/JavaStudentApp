import java.util.ArrayList;

/**
 * Represents a register of students.
 * <p>
 *   The following functionality is implemented:
 *   <ul>
 *     <li>Search for student by name</li>
 *     <li>Add student</li>
 *     <li>Remove student</li>
 *     <li>Get number of students</li>
 *     <li>List all students</li>
 *     <li>Get a set of students based on a criteria</li>
 *   </ul>
 * </p>
 *
 * @author Matthew
 * @version 2023-09-11
 */
public class StudentRegister {
  private ArrayList<Student> students;

  /**
   * Creates an instance of StudentRegister.
   *
   */
  public StudentRegister() {
    students = new ArrayList<>();
  }

  /**
   * Adds student to the StudentRegister.
   *
   * @param student Student object to be added.
   */
  public void addStudent(Student student) {
    students.add(student);
  }

  /**
   * Returns the number of students in the register.
   *
   * @return the number of students in the register.
   */
  public int getNumberOfStudents() {
    return students.size();
  }

  /**
   * Returns the student object at the index i.
   *
   * @param i index position to get the student from.
   * @return student object at given index.
   */
  public Student getStudentAt(int i) {
    return students.get(i);
  }
}

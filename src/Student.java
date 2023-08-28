/**
 * Represents a student with name, age and studentID.
 *
 * @Author Matthew
 * @Version 2023-08-28
 */
public class Student {
    private String name;
    private int age;
    private String studentID;

    /**
     * Creates an instance of Student
     */
    public Student(){
        name = "Joe";
        age = 18;
        studentID = "ID";
    }

    /**
     * Creates an instance of Student
     * @param studName Students name
     * @param studAge Students age
     * @param studID Students ID
     */
    public Student(String studName, int studAge, String studID){
        name = studName;
        age = studAge;
        studentID = studID;
    }

    /**
     * gets student name
     * @return name of the student
     */
    public String getName(){
        return name;
    }

    /**
     * gets student age
     * @return age of the student
     */
    public int getAge(){
        return age;
    }

    /**
     * gets studentID
     * @return ID of the student
     */
    public String getStudentID(){
        return studentID;
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Student stud1 = new Student();
        Student stud2 = new Student("Matthew", 24, "062532");
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        System.out.printf("\nStud1 Name: " + stud1.getName()
                + " \nStud1 age: " + stud1.getAge()
                + " \nStud1 studID: " + stud1.getStudentID() + "\n");
        System.out.printf("\nStud2 Name: " + stud2.getName()
                + " \nStud2 age: " + stud2.getAge()
                + " \nStud2 studID: " + stud2.getStudentID() + "\n");
    }
}
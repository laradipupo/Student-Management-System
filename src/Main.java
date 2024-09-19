//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            //        Register student with person and studentId
            Student student1 = new Student("Lara", 20, "mcb111");
            student1.displayStudentDetails();
            student1.generateReport();

            //Register student with person, studentId and grade
            Student student2 = new Student("Naomi", 19, "mcb133", 95);
            student2.displayStudentDetails();
            student2.generateReport();

            try {
                Student student3 = new Student("Wale", 21, "Bch111");
            } catch (InvalidStudentIdFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                Student student4 = new Student("David", 23, "S1003", 105);
            } catch (InvalidGradeException e) {
                System.out.println("Error: " + e.getMessage());
            }


        } catch (InvalidGradeException | InvalidStudentIdFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
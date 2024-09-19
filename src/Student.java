public class Student extends Person implements Report{
    private String studentId;
    private int grade;

    //    overloading 1
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    //    Overloading 2
    public Student(String name, int age, String studentId, int grade) throws InvalidGradeException {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }



    public String getStudentId() {
        return studentId;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(int grade) throws InvalidGradeException{
        if(grade < 0 || grade > 100) {
            throw new InvalidGradeException("Invalid grade! Grade should be between 0 and 100.");
        }
        this.grade = grade;
    }

    public void setStudentId(String studentId) throws InvalidStudentIdFormatException {
        if(!studentId.matches("[A-Z]\\d")) {
            throw new InvalidStudentIdFormatException("Invalid student ID format! ID should be capital letter followed by 5 digits.");
        }
        this.studentId = studentId;
    }




    @Override
    public void displayStudentDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId());
        System.out.println("Grade: " + grade());
    }

    private int grade() {
        return grade;
    };

    private String studentId() {
        return null;
    }




    @Override
    public void generateReport() {

    }
}

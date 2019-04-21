public class Student extends Person {
    
    private double studentGPA;
    private String name;


    public Student(String name, int age, double studentGPA) {
        super(name, age);
        this.name = name;
        this.studentGPA = studentGPA;
    }

    public String toString() {
        return "Student name: " + name + "\nStudent GPA: " + studentGPA;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
    


}
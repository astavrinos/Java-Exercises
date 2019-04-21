public class Lecturer extends Person {

    private String name;
    private double salary;

    public Lecturer(String name, int age, double salary) {
        super(name, age);
        this.setName(name);
        this.setSalary(salary);
    }

    public String toString() {
        return "Lecturer name: " + name + "\nIncome: " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
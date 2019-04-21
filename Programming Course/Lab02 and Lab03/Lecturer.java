public class Lecturer extends Details {

    private String name;
    private double salary;

    public Lecturer(String name, double salary) {
        super(name);
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
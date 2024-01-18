package Task_2;

// subclass Employee extends class Persons
public class Employee extends Persons{
    // Additional attributes
    private int employeeID;
    private double salary;

    // Default Constructor
    public Employee() { }

    // Parameterized Constructor
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Call the constructor of the superclass (Persons)
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter and Setters methods
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Example of how to use the Employee class
    public static void main(String[] args) {
        Employee employee = new Employee("nagaraja", 24, 1, 500.0);

        // Accessing attributes from the base class (Persons)
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());

        // Accessing attributes from the subclass (Employee)
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Employee Salary: $" + employee.getSalary());
    }
}

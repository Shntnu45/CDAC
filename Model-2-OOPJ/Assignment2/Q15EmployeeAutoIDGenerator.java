class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private static int counter = 1001;  // starting ID

    // Default constructor
    public Employee() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    // Parameterized constructor
    public Employee(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void printDetails() {
        System.out.println("ID=" + id + ", Name=" + name + ", BasicSalary=" + basicSalary);
    }
}

public class Q15EmployeeAutoIDGenerator {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ravi", 35000);

        e1.printDetails();
        e2.printDetails();
    }
}

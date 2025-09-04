// Employee.java
class Employee {
    private String name;
    private double salary;
    private int yearsOfService;

    private static int totalEmployees = 0;

    // Constructor
    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;   // increment total employees whenever a new employee is created
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Calculate bonus (5% of salary if service > 5 years)
    public double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return 0.0;
        }
    }

    // Static method to show total employees
    public static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}

// Main class
public class Q4EmployeeSalary {
    public static void main(String[] args) {
        // Creating employees
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("Suresh", 100000, 5);

        // Printing bonuses
        System.out.println("Employee " + e1.getName() + " Bonus: " + e1.calculateBonus());
        System.out.println("Employee " + e2.getName() + " Bonus: " + e2.calculateBonus());
        System.out.println("Employee " + e3.getName() + " Bonus: " + e3.calculateBonus());

        // Showing total employees
        Employee.showTotalEmployees();
    }
}

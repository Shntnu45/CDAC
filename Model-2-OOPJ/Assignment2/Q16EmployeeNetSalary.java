class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private static int counter = 1001;

    public Employee(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateNetSalary() {
        double hra = basicSalary * 0.10; // 10%
        double da = basicSalary * 0.05;  // 5%
        double pf = basicSalary * 0.02;  // 2%
        return basicSalary + hra + da - pf;
    }

    public void printDetails() {
        System.out.println("ID=" + id + ", Name=" + name + ", Net Salary=" + calculateNetSalary());
    }
}

public class Q16EmployeeNetSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anita", 30000);
        Employee e2 = new Employee("Suresh", 45000);

        e1.printDetails();
        e2.printDetails();
    }
}

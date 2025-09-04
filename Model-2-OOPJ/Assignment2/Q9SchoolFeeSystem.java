class Student {
    private String name;
    private String className;
    private static int tuitionFee;

    // static block
    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    // constructor
    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // display
    public void printDetails() {
        System.out.println("Student: Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
}

public class Q9SchoolFeeSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Anjali", "10th");
        Student s2 = new Student("Vikram", "12th");

        s1.printDetails();
        s2.printDetails();
    }
}

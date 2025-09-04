// Student.java
class Student {
    private String name;
    private int marks;
    private static int totalStudents = 0;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalStudents++;
    }

    // Getter & Setter
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Check pass or fail
    public boolean isPassed() {
        return marks >= 35;
    }

    // Static method
    public static void showTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    public String getName() {
        return name;
    }
}

// Main Class
public class Q5StudentMarksCalculator {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Pooja", 34);
        Student s3 = new Student("Amit", 65);

        System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
        System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
        System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());

        Student.showTotalStudents();
    }
}

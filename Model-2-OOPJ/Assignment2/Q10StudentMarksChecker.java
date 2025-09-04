class Student {
    private int rollNo;
    private String name;
    private int marks;

    // constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // getter & setter
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // display
    public void printDetails() {
        System.out.println("Student: RollNo=" + rollNo + ", Name=" + name + ", Marks=" + marks);
    }
}

public class Q10StudentMarksChecker {
    public static void main(String[] args) {
        Student st = new Student(101, "Ravi", 60);

        // update marks
        st.setMarks(75);

        st.printDetails();
    }
}

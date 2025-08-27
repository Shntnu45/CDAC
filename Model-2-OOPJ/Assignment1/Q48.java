import java.util.Scanner;

class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 85) grade = "A";
        else if (marks >= 70) grade = "A−";
        else if (marks >= 55) grade = "B";
        else if (marks >= 40) grade = "C";
        else grade = "F";

        System.out.println("Grade: " + grade);
    }
}

/*24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
Input:
Enter marks: 78
Output:
Grade: B */


import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10: // 100
            case 9:  // 90-99
            case 8:  // 80-89
                System.out.println("Grade: A");
                break;
            case 7:  // 70-79
                System.out.println("Grade: B");
                break;
            case 6:  // 60-69
            case 5:  // 50-59
                if (marks >= 55) {
                    System.out.println("Grade: C");
                } else {
                    System.out.println("Grade: D");
                }
                break;
            case 4:  // 40-49
                if (marks >= 45) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: E");
                }
                break;
            case 3:  // 30-39
            case 2:  // 20-29
                System.out.println("Grade: E");
                break;
            case 1:  // 10-19
            case 0:  // 0-9
                System.out.println("Grade: F");
                break;
            default:
                System.out.println("Invalid marks!");
        }
    }
}

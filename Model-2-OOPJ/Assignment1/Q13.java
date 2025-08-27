// 13. Exam Eligibility with Medical Cause
// Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and medical cause (Y/N) as input and decide if the student can sit in exam.
// Input: Classes held: 100 Classes attended: 60 Medical cause (Y/N): Y
// Output: Student is allowed to sit for the exam.

import java.util.Scanner;

class Q13 {
public static void main(String args[] ) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        System.out.print("Medical cause (Y/N): ");
        char medicalCause = sc.next().charAt(0);

        double attendancePercentage = (attendedClasses * 100.0) / totalClasses;

        if (attendancePercentage >= 75 || medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }

    }	
	
}
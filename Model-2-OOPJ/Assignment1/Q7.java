// 7. Exam Pass or Fail
// Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed(>=35) or failed.
//Input:
//Enter marks: 42
//Output:
//Student has passed. 

import java.util.Scanner;

class Q7 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks(0 to 100): ");
		int Marks = sc.nextInt();
		
		if(Marks>=35)
		{
		System.out.println("Congratulations Yourrr Passsed....!!");
		}
		else{
		System.out.println("failed ....!! Better Luck Try Next time...!!");

		}
	}
}
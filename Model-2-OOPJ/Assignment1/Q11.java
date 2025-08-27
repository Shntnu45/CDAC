//11. Grade Based on Percentage Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
// ● 90+ → A+ ● 76–89 → A ● 66–75 → B+ ● 51–65 → B ● 36–50 → C ● Below 35 → Fail
// Input: Enter percentage marks: 82
// Output: Grade: A

import java.util.Scanner;

class Q11 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Percentage Marks: ");
		int GetMarks = sc.nextInt();
		
		if(GetMarks >= 90 && GetMarks <= 100)
		{
			System.out.println("A+");
		}
		else if(GetMarks >= 76 && GetMarks <= 89)
		{
			System.out.println("A");
		}
		else if(GetMarks >= 66 && GetMarks <= 75)
		{
			System.out.println("B+");
		}
		else if(GetMarks >= 51 && GetMarks <= 65)
		{
			System.out.println("B");
		}else if(GetMarks >= 36 && GetMarks <=  50)
		{
			System.out.println("c");
		}
		else if(GetMarks > 0 && GetMarks < 35)
		{
					System.out.println("Failllledddd...!!");
		}
		else {
		System.out.println("Enter Validddd Marks...!!");

		}
	}
}
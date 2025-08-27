//5. Square or Rectangle Garden
//Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
//square garden or rectangular.
//Input:
//Enter length: 12
//Enter breadth: 12
//Output:
//Square garden

import java.util.Scanner;

class Q5{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length of Garden : ");
		int Length= sc.nextInt();
		
		System.out.println("Enter Breadth of Garder");
		int Breadth = sc.nextInt();
		
		if(Length == Breadth)
		{
			System.out.println("Square Garden");
			
		}
		else{
			System.out.println("Rectangular Garden");
		}
		
		
		
	}
}
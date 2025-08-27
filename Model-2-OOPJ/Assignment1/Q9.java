//9. Employee Bonus Eligibility
//Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and years of service as input and print bonus amount.
//Input: Enter salary: 50000 Enter years of service: 6
//Output: Bonus amount: 2500 

import java.util.Scanner;

class Q9{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total Salary amount: ");
		double Salary = sc.nextDouble();
		
		System.out.println("Enter Year Of Service: ");
		double Service = sc.nextDouble();
		
		double Bonus;
		
		if(Service > 5)
		{
			Bonus = Salary * 0.5 ;			
		}
		else{
			Bonus = Salary;
		}
		System.out.println("Bonus is "+Bonus);
		
	}
}
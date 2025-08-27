/*18. Day of the Week
Scenario: Take day number (1–7) and print the day name.
Input:
Enter day number: 4
Output:
Day is Thursday*/

import java.util.Scanner;

class Q18{
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int day = sc.nextInt();

		
		switch(day){
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				break;

			default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
			
			

		}
	}
}
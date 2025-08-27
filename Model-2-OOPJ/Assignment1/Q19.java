/*
19. Days in a Month
Scenario: Take month number (1–12) and print number of days in that month.
Input:
Enter month number: 2
Output:
28 or 29 days
*/



import java.util.Scanner;

class Q19{
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter month number (1-12): ");
		 
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } 
        else if (month == 2) {
            System.out.println("28 or 29 days");
        } 
        else {
            System.out.println("Invalid month number! Please enter 1–12.");
        }
	}
}
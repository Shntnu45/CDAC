// 14. Reverse a 4-Digit Number Scenario: Take a 4-digit number and print its reverse.
// Input: Enter 4-digit number: 1234
// Output: Reversed number: 4321


import java.util.Scanner;

class Q14 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Digit Number: ");
		
		int Num = sc.nextInt();
		
		int rev =0;
		
		while(Num >0){
			int rem = Num%10;
			
			rev=rev*10+rem;
			Num=Num/10;

		}
		System.out.println("Reversed number: "+rev);

	}	
}
//4. Even or Odd Locker Number
//Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
//even or odd.
//Input:
//Enter locker number: 17
//Output:
//Odd locker number

import java.util.Scanner;

class Q3{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Transaction amount: ");
		double Amount= sc.nextDouble();
		
		if(Amount > 0)
		{
			System.out.println("Deposit Transition");
		}
		else if(Amount < 0){
			System.out.println("Withdrawal Transition");
		}
		else{
			System.out.println("No Transaction");
		}
	}
}
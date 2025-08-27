//4. Even or Odd Locker Number
//Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
//even or odd.
//Input:
//Enter locker number: 17
//Output:
//Odd locker number

import java.util.Scanner;

class Q4{
	public static void main (String args[]){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Locker Number");
	int LockerNo= sc.nextInt();
	
	if(LockerNo %2 == 0){
		System.out.println("Even Locker Number");
	}
	else{
		System.out.println("Odd Locker Number");
	}
}
}
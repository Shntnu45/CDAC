//8. Shop Discount Calculation
//Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amountas input and calculate final cost.
//Input: Enter total purchase amount: 1200
//Output: Final cost after discount: 1080

import java.util.Scanner;

class Q8{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total purchase amount: ");
		
		double Purchase = sc.nextDouble();
		
		double finalAmount;
		if(Purchase > 1000){
		finalAmount=(Purchase-(Purchase*0.10));
		}
		else{
			finalAmount= Purchase;
		}
		System.out.println("FinalCost of "+finalAmount);
		
	}
}
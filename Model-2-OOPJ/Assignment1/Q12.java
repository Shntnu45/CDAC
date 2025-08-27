//12. Oldest and Youngest Among Three Friends
//Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the oldest and youngest.
//Input: Enter age of Friend 1: 22 / Enter age of Friend 2: 25 / Enter age of Friend 3: 20
//Output: Oldest: Friend 2/ Youngest: Friend 3

import java.util.Scanner;

class Q12
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age of Friend 1: ");
		int age1 = sc.nextInt();
		
		System.out.println("Enter age of Friend 2: ");
		int age2 = sc.nextInt();
		
		System.out.println("Enter age of Friend 3: ");
		int age3 = sc.nextInt();
	
//Oldest	
	if (age1 > age2 && age1 > age3) {
            System.out.println("Oldest: Friend 1");
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("Oldest: Friend 2");
        } else {
            System.out.println("Oldest: Friend 3");
        }
	
	//youngest
	if (age1 < age2 && age1 < age3) {
            System.out.println("Youngest: Friend 1");
        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Youngest: Friend 2");
        } else {
            System.out.println("Youngest: Friend 3");
        }
		
	}
	
}
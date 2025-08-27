/* 16. Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input.
Input: Enter a character: e
Output: Vowel */

// a e i o u 

import java.util.Scanner;

class Q16{
	
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character ");
		char ch = sc.next().charAt(0);
		
		if(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U')
{
	System.out.println("Vowel");
	
}
else if(ch>'A'&& ch<'Z'||ch>'a'&& ch<'z'){
		System.out.println("Consonant");
}
else{
			System.out.println("Ooppsss Error Found");

}
	}
}


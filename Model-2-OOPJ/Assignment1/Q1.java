import java.util.Scanner;

class Q1
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Score for Test1:");		
		int Test1 = sc.nextInt();
		
			System.out.println("Enter Score for Test2:");
		int Test2 = sc.nextInt();
		
		if(Test1>Test2)
		{
			System.out.println("Test 1 has higher score.");
		}
		else
		{
			System.out.println("Test 2 has higher score.");
		}
		
	}
}
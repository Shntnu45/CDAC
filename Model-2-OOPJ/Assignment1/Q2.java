import java.util.Scanner;

class Q2{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter salary for Company 1:" );
	int Company1 = sc.nextInt();
	
	System.out.println("Enter salary for Company 2:" );
	int Company2 = sc.nextInt();
	
	System.out.println("Enter salary for Company 3:" );
	int Company3 = sc.nextInt();
	
	if(Company1 >= Company2 && Company1 >= Company3){
		System.out.println("Company 1 offers the highest salary.");
	}
	else if(Company2 >= Company1 && Company2 >= Company3)
	{
		System.out.println("Company 2 offers the highest salary.");
	}
	else
	{
		System.out.println("Company 3 offers the highest salary.");
	}
	}
	

}
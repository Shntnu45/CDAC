// 10. Exam Attendance Eligibility
//Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as input, print allowance.
//Input:Enter total classes held: 100
//Enter classes attended: 78
//Output: Student is allowed to sit for the exam


import java.util.Scanner;

class Q10 {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total classes held: ");
		int held =sc.nextInt();
		
		System.out.println("Enter total classes Attended: ");
		int Attended = sc.nextInt();
		
		 double attendancePercentage = (Attended * 100.0) / held;
		
		if(attendancePercentage >= 75)
		{
			System.out.println(" Student is allowed to sit for the exam ");
		}
		else{
			System.out.println(" Student is  Nott allowed to sit for the exam ");
		}
	}
}
/* 30. Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50 */

import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

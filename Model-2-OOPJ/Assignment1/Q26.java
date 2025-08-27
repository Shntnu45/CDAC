/*
26. Season Based on Month
Scenario: Print season based on month number:
● Dec–Feb → Winter
● Mar–May → Summer
● Jun–Aug → Monsoon
● Sep–Nov → Autumn
Input:
Enter month number: 12
Output:
Season is Winter */

import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Season is Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Season is Summer");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Season is Monsoon");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Season is Autumn");
        } else {
            System.out.println("Invalid month number!");
        }
    }
}

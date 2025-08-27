import java.util.Scanner;

class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int original = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + rev);
        System.out.println("Palindrome: " + (original == rev ? "Yes" : "No"));
    }
}

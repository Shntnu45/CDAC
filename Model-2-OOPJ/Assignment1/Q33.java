import java.util.Scanner;

class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number is " + result);
    }
}

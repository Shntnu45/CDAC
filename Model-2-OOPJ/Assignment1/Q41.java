import java.util.Scanner;

class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int n = num, sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

import java.util.Scanner;

class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double finalAmount = (amount > 1000) ? amount * 0.9 : amount;

        System.out.println("Total cost after discount: " + finalAmount);
    }
}

import java.util.Scanner;

class Q42 {
    public static void main(String[] args) {
        for (int num = 100; num <= 500; num++) {
            int n = num, sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d * d;
                n /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

}

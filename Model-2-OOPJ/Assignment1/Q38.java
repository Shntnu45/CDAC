import java.util.Scanner;

class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        String result = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Vowel" : "Consonant";

        System.out.println(result);
    }
}

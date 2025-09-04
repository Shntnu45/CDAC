class BankAccount {
    private String accountHolder;
    private double balance;
    private static String bankName = "CDAC Bank";

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

public class Q14BankNameDisplay {
    public static void main(String[] args) {
        BankAccount.displayBankName();

        BankAccount acc = new BankAccount("Rahul", 12000);
        // just verifying instance creation
        System.out.println("Bank account for Rahul created successfully.");
    }
}

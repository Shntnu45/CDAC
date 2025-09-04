class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printDetails() {
        System.out.println("Account Holder=" + accountHolder + ", Balance=" + balance);
    }
}

public class Q12BankAccountBasicInfo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 10000);
        acc.printDetails();
    }
}

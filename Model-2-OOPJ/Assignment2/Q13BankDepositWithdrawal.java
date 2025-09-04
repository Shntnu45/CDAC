class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount + ". New Balance=" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew " + amount + ". New Balance=" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Q13BankDepositWithdrawal {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rohit", 5000);
        BankAccount a2 = new BankAccount("Priya", 10000);

        a1.deposit(2000);
        a1.withdraw(1000);

        a2.deposit(3000);
        a2.withdraw(15000); // should show insufficient balance
    }
}

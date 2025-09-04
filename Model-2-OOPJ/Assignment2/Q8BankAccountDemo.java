class BankAccount {
    private String name;
    private double balance;
    private static double interestRate;

    // Static block
    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void printDetails() {
        System.out.println("Account: Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

public class Q8BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rohit", 5000);
        BankAccount a2 = new BankAccount("Priya", 15000);

        a1.printDetails();
        a2.printDetails();
    }
}

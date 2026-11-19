import java.util.Scanner;

/** Demonstrates encapsulation through a simple bank account. */
public class BankAccount {
    private double balance; // The balance can only be changed through account methods.

    public BankAccount(double initialBalance) {
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        balance = initialBalance;
    }

    // Deposits only finite, positive amounts. Invalid values leave state unchanged.
    public void deposit(double amount) {
        if (Double.isFinite(amount) && amount > 0 && amount <= Double.MAX_VALUE - balance) {
            balance += amount;
        }
    }

    // Returns false for non-finite, non-positive or unaffordable withdrawals.
    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    // Provides access to the balance without exposing the field itself.
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            System.out.println("Initial balance cannot be negative.");
            sc.close();
            return;
        }

        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        System.out.println("Withdrawal successful: " + account.withdraw(withdrawal));
        System.out.println("Current balance: " + account.getBalance());
        sc.close();
    }
}
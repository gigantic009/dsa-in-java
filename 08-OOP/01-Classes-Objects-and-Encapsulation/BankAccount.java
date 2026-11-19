import java.util.Scanner;

public class BankAccount {
    private double balance; // Private balance prevents uncontrolled direct modification.

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Only accept positive deposits.
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false; // Reject invalid amounts and withdrawals beyond the balance.
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance; // Return the current balance without exposing the field.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        if (initialBalance < 0) {
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

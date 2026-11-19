// Encapsulation protects balance and validates account operations.
public class BankAccount {
 private double balance;
 public BankAccount(double initial){if(initial<0)throw new IllegalArgumentException();balance=initial;}
 public void deposit(double amount){if(amount>0)balance+=amount;}
 public boolean withdraw(double amount){if(amount<=0||amount>balance)return false;balance-=amount;return true;}
 public double getBalance(){return balance;}
}
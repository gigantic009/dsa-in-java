import java.util.Scanner;

interface PaymentMethod {
    void pay(double amount); // Interface describes the operation without its implementation.
}

class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via card: " + amount);
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount to pay: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            sc.close();
            return;
        }

        sc.nextLine(); // Consume the newline before reading the method as text.
        System.out.print("Payment method (upi/card): ");
        String choice = sc.nextLine().trim().toLowerCase();

        PaymentMethod payment; // Abstraction lets this variable refer to either implementation.
        if (choice.equals("upi")) {
            payment = new UpiPayment();
        } else if (choice.equals("card")) {
            payment = new CardPayment();
        } else {
            System.out.println("Unsupported payment method.");
            sc.close();
            return;
        }

        payment.pay(amount); // Caller depends on the interface, not a concrete payment class.
        sc.close();
    }
}

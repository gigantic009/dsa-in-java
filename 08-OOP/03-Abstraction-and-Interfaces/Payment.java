import java.util.Scanner;

/** Demonstrates abstraction by using a payment interface. */
interface PaymentMethod {
    void pay(double amount);
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

        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Amount must be positive.");
            sc.close();
            return;
        }

        sc.nextLine(); // Consume the newline before reading the next line.
        System.out.print("Payment method (upi/card): ");
        String choice = sc.nextLine().trim().toLowerCase();

        // The interface reference can hold either payment implementation.
        PaymentMethod payment;
        if (choice.equals("upi")) {
            payment = new UpiPayment();
        } else if (choice.equals("card")) {
            payment = new CardPayment();
        } else {
            System.out.println("Unsupported payment method.");
            sc.close();
            return;
        }

        payment.pay(amount);
        sc.close();
    }
}
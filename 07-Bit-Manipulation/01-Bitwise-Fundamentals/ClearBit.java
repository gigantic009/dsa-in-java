import java.util.Scanner;

public class ClearBit {
    // Turns the selected bit off without changing other bit positions.
    public static int clear(int number, int bit) {
        int mask = 1 << bit; // Identify the bit that must be cleared.
        return number & ~mask; // NOT makes that mask bit 0; AND clears it.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int bit = sc.nextInt();

        if (bit < 0 || bit > 31) {
            System.out.println("Bit position must be between 0 and 31.");
        } else {
            System.out.println("Result after clearing bit: " + clear(number, bit));
        }

        sc.close();
    }
}

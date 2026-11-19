import java.util.Scanner;

/** Toggles a selected bit: 0 becomes 1, and 1 becomes 0. */
public class ToggleBit {

    // XOR flips only the bit where the mask contains a 1.
    public static int toggle(int number, int bit) {
        // Validate here too so callers outside main cannot trigger wrapped shifts.
        if (bit < 0 || bit > 31) {
            throw new IllegalArgumentException("Bit position must be between 0 and 31.");
        }

        int mask = 1 << bit;
        return number ^ mask;
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
            System.out.println("Result after toggling bit: " + toggle(number, bit));
        }

        sc.close();
    }
}
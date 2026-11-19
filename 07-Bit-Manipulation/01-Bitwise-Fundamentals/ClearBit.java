import java.util.Scanner;

/** Clears (sets to 0) a selected bit in an integer. */
public class ClearBit {

    // Leaves all other bits unchanged.
    public static int clear(int number, int bit) {
        // Validate here too so callers outside main cannot trigger wrapped shifts.
        if (bit < 0 || bit > 31) {
            throw new IllegalArgumentException("Bit position must be between 0 and 31.");
        }

        int mask = 1 << bit;

        // NOT turns the mask's selected bit off; AND clears that bit in number.
        return number & ~mask;
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
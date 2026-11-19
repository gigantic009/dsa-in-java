import java.util.Scanner;

/** Checks whether a chosen bit in an integer is set (1). */
public class CheckBit {

    // Bit positions are zero-based: position 0 is the rightmost bit.
    public static boolean isSet(int number, int bit) {
        if (bit < 0 || bit > 31) {
            return false;
        }

        // Shift 1 into the requested position, then use AND to inspect it.
        int mask = 1 << bit;
        return (number & mask) != 0;
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
            System.out.println("Is the bit set? " + isSet(number, bit));
        }

        sc.close();
    }
}
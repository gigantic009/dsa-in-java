import java.util.Scanner;

public class CheckBit {
    // Returns true if the requested (zero-based) bit is 1.
    public static boolean isSet(int number, int bit) {
        if (bit < 0 || bit > 31) {
            return false; // Java int values have 32 bit positions.
        }

        int mask = 1 << bit; // Move 1 into the bit position we want to inspect.
        return (number & mask) != 0; // AND keeps only the selected bit.
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

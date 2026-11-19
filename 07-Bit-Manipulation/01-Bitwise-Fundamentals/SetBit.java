import java.util.Scanner;

public class SetBit {
    // Turns the requested bit on while leaving all other bits unchanged.
    public static int set(int number, int bit) {
        int mask = 1 << bit; // Build a mask with only the target bit set.
        return number | mask; // OR forces that bit to 1.
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
            System.out.println("Result after setting bit: " + set(number, bit));
        }

        sc.close();
    }
}

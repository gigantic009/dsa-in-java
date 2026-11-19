import java.util.Scanner;

/** Sets a selected bit to 1 in an integer. */
public class SetBit {

    // OR sets the target bit without changing the other bit positions.
    public static int set(int number, int bit) {
        int mask = 1 << bit;
        return number | mask;
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
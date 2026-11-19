import java.util.Scanner;

/** Counts the number of 1-bits in an integer using Brian Kernighan's algorithm. */
public class CountSetBits {

    // Each iteration removes the rightmost set bit; runs once per set bit.
    public static int count(int number) {
        int total = 0;

        while (number != 0) {
            number &= number - 1;
            total++;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println("Number of set bits: " + count(number));
        sc.close();
    }
}
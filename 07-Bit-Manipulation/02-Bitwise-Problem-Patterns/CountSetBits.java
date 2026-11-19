import java.util.Scanner;

public class CountSetBits {
    // Brian Kernighan's algorithm counts set bits in O(number of set bits).
    public static int count(int number) {
        int total = 0;

        while (number != 0) {
            number &= number - 1; // Remove the rightmost 1-bit on each iteration.
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

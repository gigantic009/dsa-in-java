import java.util.Scanner;

/**
 * Calculates n! iteratively for n in [0, 20], where the result fits in long.
 *
 * 0! is 1. Negative input is invalid. Values above 20 overflow long.
 *
 * Time complexity: O(n) for valid input.
 * Auxiliary space: O(1).
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (0 to 20): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else if (n > 20) {
            System.out.println("Result is too large for long");
        } else {
            long result = 1;

            // Starting at 2 is sufficient because 0! and 1! are both 1.
            for (int i = 2; i <= n; i++) {
                result *= i;
            }

            System.out.println(n + "! = " + result);
        }

        sc.close();
    }
}

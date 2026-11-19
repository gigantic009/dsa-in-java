import java.util.Scanner;

/**
 * Calculates the sum of the first n natural numbers using recursion.
 */
public class SumNaturalNumbers {
    /**
     * Returns 1 + 2 + ... + n.
     *
     * @param n non-negative upper bound
     * @return sum of natural numbers from 1 through n (0 for n == 0)
     */
    public static long sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Base case: the sum of no numbers is zero.
        if (n == 0) {
            return 0;
        }

        // Add n to the sum of the smaller problem.
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
            sc.close();
            return;
        }

        System.out.println("Sum: " + sum(n));
        sc.close();
    }
}

/*
 * Trace for sum(4):
 * sum(4) = 4 + sum(3)
 *        = 4 + 3 + sum(2)
 *        = 4 + 3 + 2 + sum(1)
 *        = 4 + 3 + 2 + 1 + sum(0)
 *        = 10
 *
 * Time complexity: O(n), one call per value down to zero.
 * Auxiliary space: O(n), due to the call stack.
 */

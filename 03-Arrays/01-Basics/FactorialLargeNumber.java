/*
 * Problem: Compute the factorial of a non-negative integer
 * whose result may exceed primitive numeric types.
 * LeetCode: Not available
 * Time: O(n) multiplications (digit complexity grows with the result)
 */

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Input must be non-negative");
            sc.close();
            return;
        }

        // BigInteger avoids overflow when the factorial exceeds long's range.
        BigInteger factorial = BigInteger.ONE;
        // Start at 2 because 0! and 1! are both 1.
        for (int i = 2; i <= n; i++) {
            // Multiply the running result by each integer through n.
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        sc.close();
    }
}

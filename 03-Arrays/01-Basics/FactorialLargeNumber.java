/*
 * Problem: Compute the factorial of a non-negative integer
 * whose result may exceed primitive numeric types.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n) multiplications.
 * Space Complexity: Depends on the number of digits in the result.
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
        // BigInteger can store numbers larger than long.
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        sc.close();
    }
}

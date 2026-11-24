// Naive recursive Fibonacci: intentionally demonstrates overlapping subproblems.
// Time Complexity: O(2^n) upper bound; Space Complexity: O(n) recursion depth.
// This version is meant for small n; values above roughly 40 become very slow.
import java.util.Scanner;

public class FibonacciRecursion {
    public static long fibonacci(int n) {
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException("n must be between 0 and 92");
        }

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (0-92; values above about 40 are very slow): ");
        int n = sc.nextInt();

        try {
            System.out.println("Fibonacci: " + fibonacci(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

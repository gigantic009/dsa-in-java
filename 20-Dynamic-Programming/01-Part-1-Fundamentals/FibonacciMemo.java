import java.util.Arrays;
/** Computes Fibonacci numbers using top-down DP and memoization. */
public class FibonacciMemo {
    public static int fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative.");
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return solve(n, memo);
    }
    private static int solve(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = Math.addExact(solve(n - 1, memo), solve(n - 2, memo));
        return memo[n];
    }
    public static void main(String[] args) { System.out.println(fib(10)); // 55
    }
}
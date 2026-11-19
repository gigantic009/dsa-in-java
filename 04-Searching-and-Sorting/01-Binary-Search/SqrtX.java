/**
 * Sqrt(x) (LeetCode 69)
 * Compute floor(sqrt(x)) without floating-point operations.
 * Example: x=8 -> 2
 * Time: O(log x) | Space: O(1)
 */
public class SqrtX {
    static int mySqrt(int x) {
        long low = 0, high = x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= x) low = mid + 1;
            else high = mid - 1;
        }
        return (int) high;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
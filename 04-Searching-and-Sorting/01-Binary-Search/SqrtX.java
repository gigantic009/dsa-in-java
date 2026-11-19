/** LeetCode 69: floor square root using binary search. O(log x) time, O(1) space. */
public class SqrtX {
    static int mySqrt(int x) {
        long low = 0, high = x;                  // Use long to avoid multiplication overflow.
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= x) low = mid + 1;   // This value fits; try a larger one.
            else high = mid - 1;                  // Square is too large; shrink range.
        }
        return (int) high;                        // high is the largest valid square root.
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));             // Prints 2.
    }
}
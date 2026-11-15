/**
 * Question:
 * Given an array of positive integers and a target value x, find the
 * minimum length of a contiguous subarray whose sum is strictly greater
 * than x. Print 0 if no such subarray exists. Read n, the array, then x.
 *
 * LeetCode: Not available — no exact problem number verified.
 *
 * Companies: Not listed
 */
import java.util.Scanner;

public class SmallestSubarraySumGreaterThanValue {
    public static int minLength(int[] values, long target) {
        int left = 0;
        int best = values.length + 1;
        long sum = 0;

        for (int right = 0; right < values.length; right++) {
            sum += values[right];

            while (sum > target) {
                best = Math.min(best, right - left + 1);
                sum -= values[left++];
            }
        }
        return best == values.length + 1 ? 0 : best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        long target = scanner.nextLong();

        System.out.println(minLength(values, target));
        scanner.close();
    }
}

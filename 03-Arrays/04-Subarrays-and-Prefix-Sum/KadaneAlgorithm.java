/**
 * Question:
 * Given an integer array, find the maximum possible sum of a non-empty
 * contiguous subarray. Read n and the n array elements from standard input.
 *
 * LeetCode: #53
 *
 * Companies: Not listed
 */
import java.util.Scanner;

public class KadaneAlgorithm {
    public static long maxSubarraySum(int[] arr) {
        long current = arr[0], best = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            best = Math.max(best, current);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println(maxSubarraySum(arr));
        scanner.close();
    }
}
/**
 * Question:
 * Given a sorted array that has been rotated, determine whether a pair
 * sums to the target. Read n, the array values, and the target from input.
 *
 * LeetCode: Not available — this exact sorted-and-rotated-array variant
 * has no verified exact LeetCode mapping here.
 *
 * Companies: Microsoft, Google, Apple
 */
import java.util.Scanner;

public class PairSumSortedRotatedArray {
    public static boolean hasPair(int[] values, long target) {
        int n = values.length;
        if (n < 2) return false;

        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (values[i] > values[i + 1]) {
                pivot = i;
                break;
            }
        }

        int left = (pivot + 1) % n;
        int right = pivot;

        while (left != right) {
            long sum = (long) values[left] + values[right];
            if (sum == target) return true;

            if (sum < target) left = (left + 1) % n;
            else right = (n + right - 1) % n;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        long target = scanner.nextLong();

        System.out.println(hasPair(values, target) ? "YES" : "NO");
        scanner.close();
    }
}

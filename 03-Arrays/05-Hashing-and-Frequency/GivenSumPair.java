/**
 * Question:
 * Given an integer array and a target value, determine whether any two
 * elements add up to the target. Read n, the array elements, and target
 * from standard input. Print YES if such a pair exists; otherwise print NO.
 *
 * LeetCode: Not available — the source wording does not specify whether
 * indices or the pair itself must be returned.
 *
 * Companies: Infosys, Amazon, Flipkart
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GivenSumPair {
    public static boolean hasPair(int[] values, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int value : values) {
            if (seen.contains(target - value)) {
                return true;
            }
            seen.add(value);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        System.out.println(hasPair(values, target) ? "YES" : "NO");
        scanner.close();
    }
}

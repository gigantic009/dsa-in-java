/**
 * Question:
 * An array contains n + 1 integers where each integer is in the range
 * [1, n]. There is only one repeated number, but it may appear more than
 * once. Find the duplicate without modifying the array and using O(1)
 * extra space. Read n and the n + 1 array values from standard input.
 *
 * LeetCode: #287
 *
 * Companies: Not listed
 */
import java.util.Scanner;

public class FindDuplicateNPlusOne {
    public static int findDuplicate(int[] values) {
        int slow = values[0];
        int fast = values[0];

        do {
            slow = values[slow];
            fast = values[values[fast]];
        } while (slow != fast);

        slow = values[0];

        while (slow != fast) {
            slow = values[slow];
            fast = values[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println(findDuplicate(values));
        scanner.close();
    }
}

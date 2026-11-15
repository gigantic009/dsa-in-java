/*
 * Problem: Find the minimum jumps to reach the last index.
 * Each element gives the maximum jump length from that position.
 * LeetCode: #45
 * Companies: Not listed
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class MinimumJumpsToEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] jumps = new int[n];

        for (int i = 0; i < n; i++) {
            jumps[i] = scanner.nextInt();
        }

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int jumpCount = 0;
        int currentEnd = 0;
        int farthestReach = 0;

        for (int i = 0; i < n - 1; i++) {
            farthestReach = Math.max(farthestReach, i + jumps[i]);

            if (i == currentEnd) {
                if (farthestReach == currentEnd) {
                    System.out.println(-1);
                    return;
                }

                jumpCount++;
                currentEnd = farthestReach;

                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }

        System.out.println(jumpCount);
        scanner.close();
    }
}
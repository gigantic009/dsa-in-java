/*
 * Problem: Find the minimum jumps to reach the last index.
 * Each element gives the maximum jump length from that position.
 * LeetCode: #45
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class MinimumJumpsToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            scanner.close();
            return;
        }
        int[] jumps = new int[n];
        for (int i = 0; i < n; i++) {
            jumps[i] = scanner.nextInt();
        }
        for (int jump : jumps) {
            if (jump < 0) {
                System.out.println("Jump lengths must be non-negative");
                scanner.close();
                return;
            }
        }
        if (n <= 1) {
            System.out.println(0);
            scanner.close();
            return;
        }

        /*
         * Greedy BFS-layer idea: currentEnd marks the end of the positions
         * reachable using jumpCount jumps. farthestReach tracks how far the
         * next jump layer can extend while scanning the current layer.
         */
        int jumpCount = 0;
        int currentEnd = 0;
        int farthestReach = 0;
        for (int i = 0; i < n - 1; i++) {
            // Clamp the candidate to the last index to avoid needless overflow/range.
            long candidate = (long) i + jumps[i];
            farthestReach = Math.max(farthestReach,
                    (int) Math.min(candidate, n - 1L));
            // Reaching the current layer boundary means one jump is now necessary.
            if (i == currentEnd) {
                if (farthestReach == currentEnd) {
                    // The boundary cannot advance, so the destination is unreachable.
                    System.out.println(-1);
                    scanner.close();
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

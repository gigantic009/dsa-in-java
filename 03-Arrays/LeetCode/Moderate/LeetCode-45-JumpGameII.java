/*
 * Problem: Find the minimum jumps to reach the last index.
 * Each element gives the maximum jump length from that position.
 * LeetCode: #45
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

class LeetCode45JumpGameII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] jumps = new int[n];
        for (int i = 0; i < n; i++) {
            jumps[i] = scanner.nextInt();
        }
        if (n <= 1) {
            System.out.println(0);
            scanner.close();
            return;
        }

        /*
         * Greedy BFS-layer approach: currentEnd is the boundary reachable
         * with the current jump count. farthestReach is the next layer's boundary.
         */
        int jumpCount = 0;
        int currentEnd = 0;
        int farthestReach = 0;
        for (int i = 0; i < n - 1; i++) {
            // Expand the furthest reachable position from any index in this layer.
            farthestReach = Math.max(farthestReach, i + jumps[i]);
            if (i == currentEnd) {
                // The current layer is exhausted, so another jump is required.
                if (farthestReach == currentEnd) {
                    // No progress is possible: the final index cannot be reached.
                    System.out.println(-1);
                    scanner.close();
                    return;
                }
                jumpCount++;
                currentEnd = farthestReach;
                // Stop once the newly reached layer covers the destination.
                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }
        System.out.println(jumpCount);
        scanner.close();
    }
}

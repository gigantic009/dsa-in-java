/*
 * Problem: Answer range-sum queries using Mo's Algorithm.
 * LeetCode: Not available
 * Typical complexity: O((n + q) * sqrt(n)) pointer movement, with sorting overhead.
 * Auxiliary space: O(n + q)
 */

import java.util.Arrays;
import java.util.Scanner;

public class MosAlgorithm {
    static class Query {
        int left;
        int right;
        int index;
        int block;

        Query(int left, int right, int index, int block) {
            this.left = left;
            this.right = right;
            this.index = index;
            this.block = block;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        if (q < 0) {
            System.out.println("Invalid query count");
            sc.close();
            return;
        }

        // Divide left endpoints into blocks roughly sqrt(n) wide.
        int blockSize = Math.max(1, (int) Math.sqrt(n));
        Query[] queries = new Query[q];
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left < 0 || right < left || right >= n) {
                System.out.println("Invalid query range");
                sc.close();
                return;
            }
            queries[i] = new Query(left, right, i, left / blockSize);
        }

        /*
         * Process nearby queries together to reduce how far the active window moves.
         * Within odd blocks, reverse the right-end ordering (a zig-zag order)
         * to reduce movement between consecutive queries.
         */
        Arrays.sort(queries, (first, second) -> {
            if (first.block != second.block) {
                return Integer.compare(first.block, second.block);
            }
            if (first.block % 2 == 0) {
                return Integer.compare(first.right, second.right);
            }
            return Integer.compare(second.right, first.right);
        });

        // Answers are restored to input order using each query's original index.
        long[] answers = new long[q];
        int currentLeft = 0;
        int currentRight = -1;
        long currentSum = 0;
        for (Query query : queries) {
            // Extend the active window leftward to include the requested left bound.
            while (currentLeft > query.left) {
                currentLeft--;
                currentSum += numbers[currentLeft];
            }
            // Extend the active window rightward.
            while (currentRight < query.right) {
                currentRight++;
                currentSum += numbers[currentRight];
            }
            // Remove values left of the requested range.
            while (currentLeft < query.left) {
                currentSum -= numbers[currentLeft];
                currentLeft++;
            }
            // Remove values right of the requested range.
            while (currentRight > query.right) {
                currentSum -= numbers[currentRight];
                currentRight--;
            }
            answers[query.index] = currentSum;
        }

        // Print in the order the user originally supplied the queries.
        for (long answer : answers) {
            System.out.println(answer);
        }
        sc.close();
    }
}

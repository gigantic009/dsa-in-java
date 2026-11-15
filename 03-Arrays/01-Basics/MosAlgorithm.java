/*
 * Problem: Answer range-sum queries using Mo's Algorithm.
 * LeetCode: Not available
 * Companies: Microsoft
 * Time Complexity: O((n + q) * sqrt(n) * log q), approximately.
 * Space Complexity: O(n + q)
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
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int blockSize = Math.max(1, (int) Math.sqrt(n));

        Query[] queries = new Query[q];

        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            queries[i] = new Query(left, right, i, left / blockSize);
        }

        // Sort queries by block, then alternate the right-end order.
        Arrays.sort(queries, (first, second) -> {

            if (first.block != second.block) {
                return Integer.compare(first.block, second.block);
            }

            if (first.block % 2 == 0) {
                return Integer.compare(first.right, second.right);
            }

            return Integer.compare(second.right, first.right);
        });

        long[] answers = new long[q];

        int currentLeft = 0;
        int currentRight = -1;
        long currentSum = 0;

        for (Query query : queries) {

            while (currentLeft > query.left) {
                currentLeft--;
                currentSum += numbers[currentLeft];
            }

            while (currentRight < query.right) {
                currentRight++;
                currentSum += numbers[currentRight];
            }

            while (currentLeft < query.left) {
                currentSum -= numbers[currentLeft];
                currentLeft++;
            }

            while (currentRight > query.right) {
                currentSum -= numbers[currentRight];
                currentRight--;
            }

            answers[query.index] = currentSum;
        }

        // Print answers in the original query order.
        for (long answer : answers) {
            System.out.println(answer);
        }

        sc.close();
    }
}

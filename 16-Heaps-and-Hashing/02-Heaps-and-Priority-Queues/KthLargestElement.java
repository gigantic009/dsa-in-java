/*
 * Problem: Kth Largest Element in an Array
 * Difficulty: Medium
 * LeetCode: 215 - Kth Largest Element in an Array
 *
 * The heap keeps only the largest k values seen so far.
 * Time: O(n log k); Space: O(k).
 */

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int find(int[] numbers, int k) {
        if (numbers == null || k < 1 || k > numbers.length) {
            throw new IllegalArgumentException("Invalid array or k.");
        }

        // Java's PriorityQueue is a min-heap by default.
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int number : numbers) {
            heap.add(number);

            // If more than k values exist, discard the smallest.
            if (heap.size() > k) {
                heap.remove();
            }
        }

        // The smallest value among the kept top k is the kth largest.
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        System.out.println(find(numbers, 2)); // 5
    }
}

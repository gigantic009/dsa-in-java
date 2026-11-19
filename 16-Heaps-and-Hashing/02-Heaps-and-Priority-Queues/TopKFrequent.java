/*
 * Problem: Top K Frequent Elements
 * Difficulty: Medium
 * LeetCode: 347 - Top K Frequent Elements
 *
 * Tie order is unspecified.
 * Time: O(n log k) expected; Space: O(n).
 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static int[] topK(int[] numbers, int k) {
        if (numbers == null || k < 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        Map<Integer, Integer> frequency = new HashMap<>();

        // Count how often each value appears.
        for (int number : numbers) {
            frequency.merge(number, 1, Integer::sum);
        }

        if (k > frequency.size()) {
            throw new IllegalArgumentException(
                    "k cannot exceed the number of distinct values.");
        }

        // Keep the k values with the highest frequency in a min-heap.
        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (first, second) ->
                        Integer.compare(frequency.get(first), frequency.get(second)));

        for (int number : frequency.keySet()) {
            heap.add(number);

            if (heap.size() > k) {
                heap.poll(); // Remove the least frequent value among this group.
            }
        }

        int[] result = new int[k];

        // Fill from the end so values are extracted from lower to higher frequency.
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3};
        int[] result = topK(numbers, 2);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

import java.util.Arrays;

/**
 * Finds a pair of indices whose values sum to a target in a sorted array.
 *
 * The input array must be sorted in non-decreasing order.
 * Returns {-1, -1} if no such pair exists.
 */
public class TwoSumSorted {
    /**
     * Uses two pointers to find a matching pair.
     *
     * @param numbers sorted array of integers; must not be null
     * @param target desired sum
     * @return two distinct indices, or {-1, -1} if no pair is found
     */
    public static int[] find(int[] numbers, int target) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Widen before adding to prevent int overflow.
            long sum = (long) numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                // The left value is too small; advance to a larger value.
                left++;
            } else {
                // The right value is too large; move toward a smaller value.
                right--;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 8, 9};
        int target = 10;

        System.out.println(Arrays.toString(find(numbers, target))); // [1, 4]
        System.out.println(Arrays.toString(find(numbers, 20)));    // [-1, -1]
        System.out.println(Arrays.toString(find(new int[0], 0)));  // [-1, -1]
    }
}

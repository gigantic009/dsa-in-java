// Prints the first negative integer in each fixed-size window using indices.
// Time: O(n); space: O(k).
import java.util.ArrayDeque;
import java.util.Deque;

public class FirstNegativeInWindow {
    public static void print(int[] numbers, int windowSize) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array required");
        }
        if (windowSize <= 0 || windowSize > numbers.length) {
            throw new IllegalArgumentException("Invalid window size");
        }

        Deque<Integer> negativeIndices = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeIndices.addLast(i);
            }

            // Remove indices that have moved outside the current window.
            while (!negativeIndices.isEmpty()
                    && negativeIndices.peekFirst() <= i - windowSize) {
                negativeIndices.removeFirst();
            }

            if (i >= windowSize - 1) {
                int firstNegative = negativeIndices.isEmpty()
                        ? 0 : numbers[negativeIndices.peekFirst()];
                System.out.print(firstNegative + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3);
    }
}

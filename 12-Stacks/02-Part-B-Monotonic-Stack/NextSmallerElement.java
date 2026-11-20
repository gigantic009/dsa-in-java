// Finds the next smaller element to the right for each array element.
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextSmallerElement {
    public static int[] find(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array required");
        }

        int[] result = new int[numbers.length];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= numbers[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(numbers[i]);
        }
        return result;
    }
}

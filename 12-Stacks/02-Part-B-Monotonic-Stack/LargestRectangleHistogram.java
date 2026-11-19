// Largest rectangle area in a histogram using a monotonic stack.
import java.util.*;
public class LargestRectangleHistogram {
    public static long largest(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        long best = 0;
        for (int i = 0; i <= heights.length; i++) {
            int height = i == heights.length ? 0 : heights[i];
            if (height < 0) throw new IllegalArgumentException("Heights must be nonnegative");
            while (!stack.empty() && heights[stack.peek()] > height) {
                int bar = heights[stack.pop()];
                int left = stack.empty() ? 0 : stack.peek() + 1;
                best = Math.max(best, (long) bar * (i - left));
            }
            stack.push(i);
        }
        return best;
    }
}
// Reverse the first k elements while preserving the remaining order.
import java.util.*;
public class ReverseFirstKQueue {
    public static void reverse(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size()) {
            throw new IllegalArgumentException("Invalid k");
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while (!stack.empty()) {
            queue.add(stack.pop());
        }

        int remaining = queue.size() - k;
        for (int i = 0; i < remaining; i++) {
            queue.add(queue.remove());
        }
    }
}

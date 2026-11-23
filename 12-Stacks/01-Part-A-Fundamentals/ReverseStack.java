// Reverse a stack recursively without using another stack.
import java.util.Stack;

public class ReverseStack {
    private static void insertBottom(Stack<Integer> stack, int value) {
        if (stack.empty()) {
            stack.push(value);
            return;
        }

        // Temporarily remove the items above the bottom.
        int top = stack.pop();
        insertBottom(stack, value);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }

        // Remove the top item, reverse the rest, then insert it at the bottom.
        int top = stack.pop();
        reverse(stack);
        insertBottom(stack, top);
    }
}

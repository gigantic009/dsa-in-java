// Stack supporting getMin in O(1) using encoded values.
// push, pop, top, and getMin are all O(1); space is O(n).
import java.util.ArrayDeque;

public class MinStack {
    private final ArrayDeque<Long> stack = new ArrayDeque<>();
    private long minimum;

    public void push(int value) {
        long current = value;

        if (stack.isEmpty()) {
            stack.push(current);
            minimum = current;
        } else if (current >= minimum) {
            stack.push(current);
        } else {
            // Store an encoded value so the previous minimum can be recovered.
            stack.push(2 * current - minimum);
            minimum = current;
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }

        long storedValue = stack.pop();
        if (storedValue < minimum) {
            int actualValue = (int) minimum;
            minimum = 2 * minimum - storedValue;
            return actualValue;
        }
        return (int) storedValue;
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }

        long storedValue = stack.peek();
        return (int) (storedValue < minimum ? minimum : storedValue);
    }

    public int getMin() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        return (int) minimum;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
    }
}

// Generates binary representations from 1 through n using a FIFO queue.
// Time and space: O(n).
import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void generate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be nonnegative");
        }
        if (n == 0) {
            return;
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.println(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        generate(10);
    }
}

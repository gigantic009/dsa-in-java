import java.util.ArrayList;
import java.util.List;

/**
 * Generates every well-formed string containing n pairs of parentheses.
 * LeetCode 22: Generate Parentheses.
 */
public class GenerateParentheses {

    public static List<String> generate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative.");
        }

        List<String> result = new ArrayList<>();
        build(n, 0, 0, new StringBuilder(), result);
        return result;
    }

    private static void build(int n, int open, int close,
                              StringBuilder current, List<String> result) {
        // A complete string contains exactly 2*n characters.
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }

        // Add '(' while we still have pairs left to open.
        if (open < n) {
            current.append('(');
            build(n, open + 1, close, current, result);
            current.deleteCharAt(current.length() - 1); // Undo.
        }

        // ')' is legal only when it won't make the prefix invalid.
        if (close < open) {
            current.append(')');
            build(n, open, close + 1, current, result);
            current.deleteCharAt(current.length() - 1); // Undo.
        }
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}

// Evaluates integer postfix expressions with whitespace-separated tokens.
// Time: O(tokens); space: O(tokens).
import java.util.ArrayDeque;

public class PostfixEvaluation {
    public static int evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression required");
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
                continue;
            }

            if (stack.size() < 2) {
                throw new IllegalArgumentException("Malformed expression");
            }

            int second = stack.pop();
            int first = stack.pop();

            switch (token) {
                case "+":
                    stack.push(first + second);
                    break;
                case "-":
                    stack.push(first - second);
                    break;
                case "*":
                    stack.push(first * second);
                    break;
                case "/":
                    if (second == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    stack.push(first / second);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Malformed expression");
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("12 3 4 * +"));
    }
}

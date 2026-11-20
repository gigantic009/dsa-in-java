// Processes a character stream and reports the first non-repeating character.
import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static String process(String stream) {
        if (stream == null) {
            throw new IllegalArgumentException("String required");
        }

        int[] frequency = new int[26];
        Queue<Character> queue = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (char character : stream.toCharArray()) {
            if (character < 'a' || character > 'z') {
                throw new IllegalArgumentException("Only lowercase letters are supported");
            }

            frequency[character - 'a']++;
            queue.add(character);

            while (!queue.isEmpty() && frequency[queue.peek() - 'a'] > 1) {
                queue.remove();
            }

            result.append(queue.isEmpty() ? '#' : queue.peek());
        }
        return result.toString();
    }
}

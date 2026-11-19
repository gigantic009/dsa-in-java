/*
 * Problem: Group Anagrams
 * Difficulty: Medium
 * LeetCode: 49 - Group Anagrams
 *
 * Assumption: words contain lowercase English letters (a-z).
 * Time: O(n * m), where m is the average word length.
 * Space: O(n * m) for the grouped words and keys.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> group(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            if (word == null) {
                throw new IllegalArgumentException("Words must not be null.");
            }

            int[] frequency = new int[26];

            // Build a character-frequency signature for this word.
            for (char character : word.toCharArray()) {
                if (character < 'a' || character > 'z') {
                    throw new IllegalArgumentException(
                            "Only lowercase English letters are supported.");
                }
                frequency[character - 'a']++;
            }

            String key = Arrays.toString(frequency);

            // Add the word to its matching group, creating one if necessary.
            groups.computeIfAbsent(key, unused -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(words));
    }
}

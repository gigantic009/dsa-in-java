// Utility for building a trie from a list of lowercase English words.
public class WordSearchTrie {
    static class Node {
        final Node[] children = new Node[26];
        String word;
    }

    // Builds a trie; each terminal node stores the word for convenient retrieval.
    public static Node build(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Word array must not be null.");
        }

        Node root = new Node();
        for (String word : words) {
            if (word == null) {
                throw new IllegalArgumentException("Words must not be null.");
            }

            Node node = root;
            for (char ch : word.toCharArray()) {
                if (ch < 'a' || ch > 'z') {
                    throw new IllegalArgumentException("Only lowercase English letters a-z are supported.");
                }

                int index = ch - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Node();
                }
                node = node.children[index];
            }
            node.word = word;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = build(new String[] {"cat", "car", "dog"});
        System.out.println(root.children['c' - 'a'] != null); // true
        System.out.println(root.children['d' - 'a'] != null); // true
    }
}

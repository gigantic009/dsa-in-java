// Trie stores lowercase English words and supports exact-word and prefix lookup.
public class Trie {
    private static class Node {
        private final Node[] children = new Node[26];
        private boolean isWord;
    }

    private final Node root = new Node();

    // Inserts a word. Empty strings are supported; null and non-lowercase input are rejected.
    public void insert(String word) {
        validate(word);
        Node node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Node();
            }
            node = node.children[index];
        }
        node.isWord = true;
    }

    // Returns true only if the complete word was previously inserted.
    public boolean search(String word) {
        validate(word);
        Node node = find(word);
        return node != null && node.isWord;
    }

    // Returns true if the trie contains the given prefix (including the empty prefix).
    public boolean startsWith(String prefix) {
        validate(prefix);
        return find(prefix) != null;
    }

    // O(L) time, where L is the input length.
    private Node find(String text) {
        Node node = root;
        for (char ch : text.toCharArray()) {
            node = node.children[ch - 'a'];
            if (node == null) {
                return null;
            }
        }
        return node;
    }

    private void validate(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input must not be null.");
        }
        for (char ch : text.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                throw new IllegalArgumentException("Only lowercase English letters a-z are supported.");
            }
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");

        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // true
        System.out.println(trie.search("ap"));      // false
        System.out.println(trie.startsWith("ap"));  // true
        System.out.println(trie.startsWith(""));    // true
    }
}

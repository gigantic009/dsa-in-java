// Trie supports efficient prefix-based word storage and lookup.
public class Trie {
    private static class Node {
        Node[] children = new Node[26];
        boolean word;
    }

    private final Node root = new Node();

    public void insert(String s) {
        Node node = root;

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Node();
            }
            node = node.children[index];
        }

        node.word = true;
    }

    public boolean search(String s) {
        Node node = find(s);
        return node != null && node.word;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private Node find(String s) {
        Node node = root;

        for (char ch : s.toCharArray()) {
            node = node.children[ch - 'a'];
            if (node == null) {
                return null;
            }
        }

        return node;
    }
}

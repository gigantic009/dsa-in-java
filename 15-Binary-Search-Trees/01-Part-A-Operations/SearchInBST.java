/*
 * Problem: Search for a Value in a Binary Search Tree
 * Difficulty: Easy
 * Interview practice: Standard BST search.
 *
 * Time: O(h); recursive stack: O(h).
 */

public class SearchInBST {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false; // The key was not found.
        }

        if (root.value == key) {
            return true;
        }

        // A smaller key can only be in the left subtree.
        if (key < root.value) {
            return search(root.left, key);
        }

        // A larger key can only be in the right subtree.
        return search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);

        System.out.println(search(root, 6));  // true
        System.out.println(search(root, 12)); // false
    }
}

/*
 * Problem: Invert Binary Tree
 * Difficulty: Easy
 * LeetCode: 226 - Invert Binary Tree
 * Interview practice: Commonly used to test recursion fundamentals.
 *
 * Time complexity: O(n).
 * Space complexity: O(h) due to recursion.
 */

public class InvertBinaryTree {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node invert(Node root) {
        if (root == null) {
            return null;
        }

        // Swap the two children of this node.
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Invert the subtrees after the swap.
        invert(root.left);
        invert(root.right);

        return root;
    }
}

/*
 * Problem: Lowest Common Ancestor of Two Nodes in a Binary Tree
 * Difficulty: Medium
 * LeetCode: 236 - Lowest Common Ancestor of a Binary Tree
 *
 * This version assumes both target nodes exist in the tree.
 * Time complexity: O(n).
 * Space complexity: O(h) due to recursion.
 */

public class LowestCommonAncestor {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node lca(Node root, Node a, Node b) {
        // If this subtree is empty or contains one target, return that result.
        if (root == null || root == a || root == b) {
            return root;
        }

        Node leftResult = lca(root.left, a, b);
        Node rightResult = lca(root.right, a, b);

        // If targets are found on different sides, this node is their ancestor.
        if (leftResult != null && rightResult != null) {
            return root;
        }

        // Otherwise, propagate whichever side found a target.
        return leftResult != null ? leftResult : rightResult;
    }
}

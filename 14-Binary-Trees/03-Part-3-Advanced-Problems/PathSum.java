/*
 * Problem: Path Sum (Root-to-Leaf)
 * Difficulty: Easy
 * LeetCode: 112 - Path Sum
 *
 * Only paths ending at a leaf are accepted.
 * Time complexity: O(n).
 * Space complexity: O(h) due to recursion.
 */

public class PathSum {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static boolean exists(Node root, int target) {
        if (root == null) {
            return false;
        }

        // Subtract the current node from the remaining target.
        target -= root.value;

        // A path counts only if it reaches a leaf with no remainder.
        if (root.left == null && root.right == null) {
            return target == 0;
        }

        // Check either child; one matching path is enough.
        return exists(root.left, target) || exists(root.right, target);
    }
}

/*
 * Problem: Validate Binary Search Tree
 * Difficulty: Medium
 * Interview practice: Recursive bounds technique.
 *
 * Duplicate values are not allowed in this strict BST.
 * Time: O(n).
 * Recursion space: O(h).
 */

public class ValidateBST {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static boolean isValid(Node root) {
        // Long bounds allow valid int values at Integer.MIN_VALUE/MAX_VALUE.
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean check(Node root, long lower, long upper) {
        if (root == null) {
            return true;
        }

        // Every node must obey the bounds inherited from all its ancestors.
        if (root.value <= lower || root.value >= upper) {
            return false;
        }

        return check(root.left, lower, root.value)
                && check(root.right, root.value, upper);
    }
}

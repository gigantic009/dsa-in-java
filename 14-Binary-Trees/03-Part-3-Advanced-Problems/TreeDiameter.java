/*
 * Problem: Diameter of a Binary Tree
 * Difficulty: Easy
 * LeetCode: 543 - Diameter of Binary Tree
 *
 * Diameter is measured in edges, not nodes.
 * Time complexity: O(n), because height is calculated once per node.
 * Space complexity: O(h) due to recursion.
 */

public class TreeDiameter {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Stores the best diameter found during the height calculation.
    private static int diameter;

    // Returns subtree height in nodes and updates the diameter in edges.
    private static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // A path through this node uses one edge per child-height level.
        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int diameter(Node root) {
        diameter = 0; // Reset for each new tree.
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        // Example:
        //       1
        //      / \
        //     2   3
        //    /
        //   4
        //  /
        // 5
        // Diameter is 4 edges (5 -> 4 -> 2 -> 1 -> 3).

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        System.out.println("Diameter: " + diameter(root)); // 4
    }
}

/*
 * Problem: Maximum Depth of a Binary Tree
 * Difficulty: Easy
 * LeetCode: 104 - Maximum Depth of Binary Tree
 * Interview practice: Frequently used tree-recursion question.
 *
 * Time complexity: O(n), because each node is visited once.
 * Space complexity: O(h), due to the recursion stack.
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class MaximumDepth {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Depth is measured here in number of nodes along the longest path.
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        // The current node adds one to the deeper child path.
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    /*
     * Builds a tree from level-order values.
     * -1 represents a missing child.
     * Example: 1 2 3 -1 4 creates a tree with 4 as node 2's right child.
     */
    private static Node buildTree(int[] values) {
        if (values.length == 0 || values[0] == -1) {
            return null;
        }

        Node root = new Node(values[0]);
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        int index = 1;

        // Assign children to nodes in the same order they enter the queue.
        while (!queue.isEmpty() && index < values.length) {
            Node parent = queue.remove();

            if (values[index] != -1) {
                parent.left = new Node(values[index]);
                queue.add(parent.left);
            }
            index++;

            if (index < values.length && values[index] != -1) {
                parent.right = new Node(values[index]);
                queue.add(parent.right);
            }
            index++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of level-order entries: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("The number of entries cannot be negative.");
            scanner.close();
            return;
        }

        int[] values = new int[n];

        System.out.println("Enter level-order values (-1 for missing nodes):");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        Node root = buildTree(values);
        System.out.println("Maximum depth: " + maxDepth(root));

        scanner.close();
    }
}

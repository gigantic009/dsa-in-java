/*
 * Problem: Kth Smallest Element in a BST
 * Difficulty: Medium
 * Interview practice: Inorder traversal pattern.
 *
 * Inorder visits BST values in increasing order.
 * Time: O(n) worst case; stops early when kth value is found.
 * Auxiliary space: O(h).
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class KthSmallestBST {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static int kthSmallest(Node root, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be positive");
        }

        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;

        // Iterative inorder traversal: smallest values are visited first.
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            // This node is the next smallest value.
            k--;
            if (k == 0) {
                return current.value;
            }

            current = current.right;
        }

        // k is larger than the number of nodes (or root was empty).
        throw new IllegalArgumentException("k exceeds the number of nodes");
    }
}

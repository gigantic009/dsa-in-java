/*
 * Problem: Binary Tree Inorder Traversal (Iterative)
 * Difficulty: Easy
 * LeetCode: 94 - Binary Tree Inorder Traversal
 *
 * Traversal order: Left -> Node -> Right
 * Time complexity: O(n).
 * Auxiliary space: O(h), where h is the tree height.
 */

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Deque;

public class InorderTraversal {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static List<Integer> traverse(Node root) {
        List<Integer> result = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;

        // Continue while there are nodes to visit or saved ancestors.
        while (current != null || !stack.isEmpty()) {

            // Save ancestors and move as far left as possible.
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // The left subtree is complete, so visit the saved node.
            current = stack.pop();
            result.add(current.value);

            // Now explore its right subtree.
            current = current.right;
        }

        return result;
    }
}

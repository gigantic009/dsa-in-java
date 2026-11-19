/*
 * Problem: Binary Tree Level Order Traversal
 * Difficulty: Medium
 * LeetCode: 102 - Binary Tree Level Order Traversal
 *
 * Time complexity: O(n).
 * Auxiliary space: O(w), where w is the maximum width of the tree.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static List<List<Integer>> levels(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        // Each queue-size snapshot represents one complete tree level.
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.remove();
                level.add(node.value);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}

/*
 * Problem: Iterative Preorder, Inorder and Postorder Traversals
 * Difficulty: Easy
 * Interview practice: Standard binary-tree traversal fundamentals.
 *
 * Preorder: Node -> Left -> Right
 * Inorder: Left -> Node -> Right
 * Postorder: Left -> Right -> Node
 *
 * Time complexity: O(n) per traversal.
 * Auxiliary space: O(h) for preorder/inorder; O(n) for this two-stack postorder.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class IterativeTraversals {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Visit the node first, then push right and left (left is processed first).
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.value + " ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        System.out.println();
    }

    // Save ancestors while walking left, then visit and move right.
    static void inorder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }
        System.out.println();
    }

    // Two stacks make postorder straightforward for beginners to follow.
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        Deque<Node> first = new ArrayDeque<>();
        Deque<Node> second = new ArrayDeque<>();
        first.push(root);

        // Reverse a root-first processing order into left-right-node.
        while (!first.isEmpty()) {
            Node node = first.pop();
            second.push(node);

            if (node.left != null) {
                first.push(node.left);
            }
            if (node.right != null) {
                first.push(node.right);
            }
        }

        while (!second.isEmpty()) {
            System.out.print(second.pop().value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Preorder: ");
        preorder(root);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("Postorder: ");
        postorder(root);
    }
}

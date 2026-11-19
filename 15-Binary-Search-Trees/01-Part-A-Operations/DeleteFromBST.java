/*
 * Problem: Delete a Node from a Binary Search Tree
 * Difficulty: Medium
 * Interview practice: Common BST operation.
 * Duplicate keys are ignored by this repository's insertion convention.
 *
 * Time: O(h); recursive stack: O(h).
 */

public class DeleteFromBST {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        // Search for the key using the BST ordering rule.
        if (key < root.value) {
            root.left = delete(root.left, key);
        } else if (key > root.value) {
            root.right = delete(root.right, key);
        } else {
            // Case 1 and 2: zero or one child.
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: two children. Find the smallest node in right subtree.
            Node successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }

            // Copy the successor value and remove its old occurrence.
            root.value = successor.value;
            root.right = delete(root.right, successor.value);
        }

        return root;
    }

    // Inorder traversal prints values in sorted order for a valid BST.
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        root = delete(root, 5); // Delete a node with two children.
        inorder(root);          // Expected: 2 3 4 6 7 8
        System.out.println();
    }
}

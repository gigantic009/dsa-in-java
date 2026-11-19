/*
 * Problem: Insert a Value into a Binary Search Tree
 * Difficulty: Easy
 * Interview practice: Standard BST operation.
 * Duplicate values are ignored.
 *
 * Time: O(h); recursive stack: O(h).
 */

public class InsertIntoBST {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node insert(Node root, int key) {
        // The empty position is where the new node belongs.
        if (root == null) {
            return new Node(key);
        }

        if (key < root.value) {
            root.left = insert(root.left, key);
        } else if (key > root.value) {
            root.right = insert(root.right, key);
        }
        // If key equals root.value, we do not insert a duplicate.

        return root;
    }

    // Inorder traversal of a BST produces values in sorted order.
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};

        for (int value : values) {
            root = insert(root, value);
        }

        inorder(root); // Expected: 2 3 4 5 6 7 8
        System.out.println();
    }
}

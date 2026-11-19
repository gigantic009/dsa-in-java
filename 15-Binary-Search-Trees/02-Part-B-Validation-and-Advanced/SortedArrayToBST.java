/*
 * Problem: Convert a Sorted Array to a Height-Balanced BST
 * Difficulty: Easy
 * Interview practice: Divide-and-conquer tree construction.
 *
 * Assumption: The input is sorted and contains distinct values.
 * Time: O(n).
 * Recursion space: O(log n) for the balanced result.
 */

public class SortedArrayToBST {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node build(int[] values, int low, int high) {
        if (low > high) {
            return null;
        }

        // Choosing the middle value keeps the left and right sides balanced.
        int middle = low + (high - low) / 2;
        Node root = new Node(values[middle]);

        root.left = build(values, low, middle - 1);
        root.right = build(values, middle + 1, high);

        return root;
    }

    // Inorder traversal should reproduce the original sorted array.
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};

        Node root = build(values, 0, values.length - 1);
        inorder(root); // Expected: 1 2 3 4 5 6 7
        System.out.println();
    }
}

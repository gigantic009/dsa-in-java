/*
 * Problem: Count Total Nodes and Leaf Nodes in a Binary Tree
 * Difficulty: Easy
 * Interview practice: Common binary-tree fundamentals question.
 * Company tags: General interview preparation; company attribution varies by source.
 *
 * Time complexity: O(n) for each counting method.
 * Space complexity: O(h) recursion stack, where h is tree height.
 */

public class CountTreeNodes {

    // A basic binary-tree node.
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Returns the total number of nodes in the tree.
    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        // Count this node and the nodes in both subtrees.
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // A leaf is a node that has no left or right child.
    static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        // Build this tree:
        //       1
        //      / \
        //     2   3
        //    /
        //   4

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Total nodes: " + countNodes(root)); // 4
        System.out.println("Leaf nodes: " + countLeaves(root)); // 2
    }
}

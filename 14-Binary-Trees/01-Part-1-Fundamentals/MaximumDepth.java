// Compute the maximum depth of a binary tree recursively.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaximumDepth {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) { this.data = data; }
    }

    public static int maxDepth(Node root) {
        if (root == null) return 0; // Empty tree has depth zero.
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // Build a tree from level-order input; -1 represents a missing child.
    private static Node buildTree(int[] values) {
        if (values.length == 0 || values[0] == -1) return null;
        Node root = new Node(values[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            Node parent = queue.remove();
            if (index < values.length && values[index] != -1) {
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
        System.out.print("Enter number of level-order entries (-1 means missing node): ");
        int n = scanner.nextInt();
        int[] values = new int[n];
        System.out.println("Enter level-order values:");
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();
        System.out.println("Maximum depth: " + maxDepth(buildTree(values)));
        scanner.close();
    }
}
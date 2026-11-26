// Reverse a singly linked list recursively.
// Time: O(n); recursion stack: O(n).
public class ReverseRecursive {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        for (Node node = reverse(head); node != null; node = node.next) {
            System.out.print(node.value + " ");
        }
        System.out.println();
    }
}

// Create and traverse a circular singly linked list, stopping at its head.
// Time: O(n); auxiliary space: O(1).
public class CircularLinkedListTraversal {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void print(Node head) {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = a;
        print(a);
    }
}

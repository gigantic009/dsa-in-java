// Remove the nth node from the end with a lead/lag pointer gap.
// Time: O(n); auxiliary space: O(1).
public class RemoveNthFromEnd {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    public static Node remove(Node head, int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
            if (fast == null) throw new IllegalArgumentException("n exceeds list length");
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head = remove(head, 2);
        for (Node cur = head; cur != null; cur = cur.next) System.out.print(cur.value + " ");
        System.out.println();
    }
}
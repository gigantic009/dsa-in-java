// Merge two sorted singly linked lists without allocating replacement nodes.
// Time: O(m+n); auxiliary space: O(1).
public class MergeSortedLists {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.value <= b.value) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = a != null ? a : b;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(7);

        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        for (Node node = merge(a, b); node != null; node = node.next) {
            System.out.print(node.value + " ");
        }
        System.out.println();
    }
}

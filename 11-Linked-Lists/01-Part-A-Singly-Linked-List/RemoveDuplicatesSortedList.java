// Remove duplicate values from a sorted singly linked list in place.
// Time: O(n); auxiliary space: O(1).
public class RemoveDuplicatesSortedList {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        for (Node node = removeDuplicates(head); node != null; node = node.next) {
            System.out.print(node.value + " ");
        }
        System.out.println();
    }
}

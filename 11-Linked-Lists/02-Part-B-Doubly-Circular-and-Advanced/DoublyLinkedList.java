// Doubly linked list demo with tail insertion and forward/backward traversal.
// addLast: O(1); traversal: O(n); space: O(n) for nodes.
public class DoublyLinkedList {
    static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public void addLast(int value) {
        Node node = new Node(value);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void printForward() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.value + " ");
        }
        System.out.println();
    }

    public void printBackward() {
        for (Node node = tail; node != null; node = node.prev) {
            System.out.print(node.value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.printForward();
        list.printBackward();
    }
}

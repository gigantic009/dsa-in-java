// Find the shared node by identity, not by matching values.
// Time: O(m+n); auxiliary space: O(1).
public class IntersectionOfLinkedLists {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node intersection(Node a, Node b) {
        Node first = a;
        Node second = b;

        while (first != second) {
            first = first == null ? b : first.next;
            second = second == null ? a : second.next;
        }

        return first;
    }

    public static void main(String[] args) {
        Node shared = new Node(8);
        shared.next = new Node(9);

        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = shared;

        Node b = new Node(4);
        b.next = shared;

        Node result = intersection(a, b);
        System.out.println(result == null ? "No intersection" : result.value);
    }
}

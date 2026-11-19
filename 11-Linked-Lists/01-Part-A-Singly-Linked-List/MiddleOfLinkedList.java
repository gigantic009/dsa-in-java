// Find the middle node using a slow and fast pointer.
import java.util.Scanner;

public class MiddleOfLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // Two steps ensure slow reaches the midpoint.
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter node count: ");
        int n = scanner.nextInt();
        Node head = null;
        Node tail = null;
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            Node node = new Node(scanner.nextInt());
            if (head == null) head = node;
            else tail.next = node;
            tail = node;
        }
        Node result = middle(head);
        System.out.println("Middle node: " + (result == null ? "None" : result.data));
        scanner.close();
    }
}
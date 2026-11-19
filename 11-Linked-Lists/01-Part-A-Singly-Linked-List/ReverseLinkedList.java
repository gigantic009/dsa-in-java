// Reverse a singly linked list iteratively by changing link directions.
import java.util.Scanner;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next; // Preserve the next node before changing the link.
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
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
        System.out.print("Original list: ");
        printList(head);
        System.out.print("Reversed list: ");
        printList(reverse(head));
        scanner.close();
    }
}
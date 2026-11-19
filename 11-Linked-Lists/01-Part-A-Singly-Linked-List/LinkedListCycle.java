// Detect a cycle with Floyd's slow and fast pointers.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListCycle {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // Fast advances two links per iteration.
            if (slow == fast) return true; // A cycle eventually makes them meet.
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter node count: ");
        int n = scanner.nextInt();
        if (n < 0) { System.out.println("Count cannot be negative."); scanner.close(); return; }
        List<Node> nodes = new ArrayList<>();
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) nodes.add(new Node(scanner.nextInt()));
        for (int i = 0; i + 1 < n; i++) nodes.get(i).next = nodes.get(i + 1);
        System.out.print("Cycle link index (-1 for no cycle): ");
        int cycleIndex = scanner.nextInt();
        if (n > 0 && cycleIndex >= 0 && cycleIndex < n) nodes.get(n - 1).next = nodes.get(cycleIndex);
        System.out.println("Cycle detected: " + (n > 0 && hasCycle(nodes.get(0))));
        scanner.close();
    }
}
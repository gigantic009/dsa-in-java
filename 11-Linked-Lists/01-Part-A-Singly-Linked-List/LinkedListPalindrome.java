// Checks a list palindrome in O(n) time and O(1) auxiliary space.
// The second half is reversed temporarily and restored before returning.
public class LinkedListPalindrome {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find the last node of the first half.
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);
        slow.next = secondHalf;

        Node first = head;
        Node second = secondHalf;
        boolean result = true;

        while (second != null) {
            if (first.value != second.value) {
                result = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // Restore the list before returning.
        slow.next = reverse(secondHalf);
        return result;
    }

    private static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}

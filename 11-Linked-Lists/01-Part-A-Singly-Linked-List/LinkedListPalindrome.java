// Check a list palindrome in O(n) time and O(1) auxiliary space.
// The second half is reversed temporarily and restored before returning.
public class LinkedListPalindrome {
    static class Node { int value; Node next; Node(int value) { this.value = value; } }
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;
        Node slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){slow=slow.next;fast=fast.next.next;}
        Node second=reverse(slow.next); slow.next=second;
        Node a=head,b=second; boolean result=true;
        while(b!=null){if(a.value!=b.value){result=false;break;}a=a.next;b=b.next;}
        slow.next=reverse(second); return result;
    }
    private static Node reverse(Node head){Node prev=null,c=head;while(c!=null){Node n=c.next;c.next=prev;prev=c;c=n;}return prev;}
    public static void main(String[] args){Node h=new Node(1);h.next=new Node(2);h.next.next=new Node(2);h.next.next.next=new Node(1);System.out.println(isPalindrome(h));}
}
// Reverse a singly linked list recursively.
// Time: O(n); recursion stack: O(n).
public class ReverseRecursive {
    static class Node { int value; Node next; Node(int value){this.value=value;} }
    public static Node reverse(Node head){
        if(head==null||head.next==null)return head;
        Node newHead=reverse(head.next);
        head.next.next=head;head.next=null;
        return newHead;
    }
    public static void main(String[] args){
        Node h=new Node(1);h.next=new Node(2);h.next.next=new Node(3);
        for(Node n=reverse(h);n!=null;n=n.next)System.out.print(n.value+" ");
        System.out.println();
    }
}
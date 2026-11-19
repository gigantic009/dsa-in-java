// Basic doubly linked list with insertion at the tail.
public class DoublyLinkedList {
 static class Node{int value;Node prev,next;Node(int v){value=v;}}
 private Node head,tail;
 public void addLast(int v){Node n=new Node(v);if(tail==null)head=tail=n;else{tail.next=n;n.prev=tail;tail=n;}}
 public void printForward(){for(Node n=head;n!=null;n=n.next)System.out.print(n.value+" ");}
}
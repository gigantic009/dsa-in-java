// Remove the nth node from the end using a lead/lag pointer gap.
public class RemoveNthFromEnd {
 static class Node { int value; Node next; Node(int v){value=v;} }
 public static Node remove(Node head,int n){
  Node dummy=new Node(0); dummy.next=head; Node fast=dummy,slow=dummy;
  for(int i=0;i<n;i++) fast=fast.next; // Create an n-node gap between pointers.
  while(fast.next!=null){fast=fast.next;slow=slow.next;}
  slow.next=slow.next.next; // Skip the target node; dummy handles head removal.
  return dummy.next;
 }
}
// Detect a cycle with Floyd's slow and fast pointers.
public class LinkedListCycle {
 static class Node {int value;Node next;Node(int v){value=v;}}
 public static boolean hasCycle(Node head){
  Node slow=head,fast=head;
  while(fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next; // Fast moves twice; a cycle makes them meet.
   if(slow==fast)return true;}
  return false;
 }
}
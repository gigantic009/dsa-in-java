// Circular queue reuses array positions after removals.
public class CircularQueue {
 private final int[]a;private int front=0,size=0;
 public CircularQueue(int capacity){a=new int[capacity];}
 public boolean offer(int value){if(size==a.length)return false;a[(front+size)%a.length]=value;size++;return true;}
 public int poll(){if(size==0)throw new IllegalStateException();int value=a[front];front=(front+1)%a.length;size--;return value;}
 public boolean isEmpty(){return size==0;}
}
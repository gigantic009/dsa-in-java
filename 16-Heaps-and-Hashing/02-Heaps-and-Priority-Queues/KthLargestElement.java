// Kth largest value using a min-heap of size k.
import java.util.*;
public class KthLargestElement {
 public static int find(int[] nums,int k){PriorityQueue<Integer>heap=new PriorityQueue<>();
  for(int value:nums){heap.add(value);if(heap.size()>k)heap.remove(); // Discard smallest to retain top k.
  }return heap.peek();
 }
}
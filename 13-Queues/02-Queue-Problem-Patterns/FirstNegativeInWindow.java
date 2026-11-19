// First negative integer in every fixed-size window using a deque of indices.
// Time: O(n); space: O(k).
import java.util.ArrayDeque;
public class FirstNegativeInWindow {
    public static void print(int[] a,int k){if(a==null)throw new IllegalArgumentException("Array required");if(k<=0||k>a.length)throw new IllegalArgumentException("Invalid window size");ArrayDeque<Integer>d=new ArrayDeque<>();for(int i=0;i<a.length;i++){if(a[i]<0)d.addLast(i);while(!d.isEmpty()&&d.peekFirst()<=i-k)d.removeFirst();if(i>=k-1)System.out.print((d.isEmpty()?0:a[d.peekFirst()])+" ");}System.out.println();}
    public static void main(String[] args){print(new int[]{12,-1,-7,8,-15,30,16,28},3);}
}
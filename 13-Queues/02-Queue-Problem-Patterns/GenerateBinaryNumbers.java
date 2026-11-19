// Generate binary representations from 1 through n using a FIFO queue.
// Time and space: O(n).
import java.util.ArrayDeque;
public class GenerateBinaryNumbers {
    public static void generate(int n){if(n<0)throw new IllegalArgumentException("n must be nonnegative");ArrayDeque<String>q=new ArrayDeque<>();if(n==0)return;q.add("1");for(int i=0;i<n;i++){String s=q.remove();System.out.println(s);q.add(s+"0");q.add(s+"1");}}
    public static void main(String[] args){generate(10);}
}
// Find next smaller element to the right for each array element.
import java.util.*;
public class NextSmallerElement {
 public static int[]find(int[]a){int[]out=new int[a.length];Arrays.fill(out,-1);Stack<Integer>s=new Stack<>();for(int i=a.length-1;i>=0;i--){while(!s.empty()&&s.peek()>=a[i])s.pop();if(!s.empty())out[i]=s.peek();s.push(a[i]);}return out;}
}
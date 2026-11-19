// Stack supporting getMin in O(1) using encoded values.
// push, pop, top, getMin: O(1); space: O(n).
import java.util.ArrayDeque;
public class MinStack {
    private final ArrayDeque<Long> stack=new ArrayDeque<>(); private long min;
    public void push(int x){long v=x;if(stack.isEmpty()){stack.push(v);min=v;}else if(v>=min)stack.push(v);else{stack.push(2*v-min);min=v;}}
    public int pop(){if(stack.isEmpty())throw new IllegalStateException("Empty stack");long v=stack.pop();if(v<min){int actual=(int)min;min=2*min-v;return actual;}return (int)v;}
    public int top(){if(stack.isEmpty())throw new IllegalStateException("Empty stack");long v=stack.peek();return (int)(v<min?min:v);}
    public int getMin(){if(stack.isEmpty())throw new IllegalStateException("Empty stack");return (int)min;}
    public static void main(String[] args){MinStack s=new MinStack();s.push(3);s.push(1);s.push(2);System.out.println(s.getMin());s.pop();s.pop();System.out.println(s.top());}
}
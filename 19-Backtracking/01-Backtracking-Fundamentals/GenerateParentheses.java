// Generate all balanced parentheses strings of n pairs.
// Time is proportional to output size; recursion depth O(n).
import java.util.*;
public class GenerateParentheses {
 static List<String>generate(int n){if(n<0)throw new IllegalArgumentException();List<String>out=new ArrayList<>();build(n,0,0,new StringBuilder(),out);return out;}
 static void build(int n,int open,int close,StringBuilder s,List<String>out){if(s.length()==2*n){out.add(s.toString());return;}if(open<n){s.append('(');build(n,open+1,close,s,out);s.deleteCharAt(s.length()-1);}if(close<open){s.append(')');build(n,open,close+1,s,out);s.deleteCharAt(s.length()-1);}}
 public static void main(String[]args){System.out.println(generate(3));}
}
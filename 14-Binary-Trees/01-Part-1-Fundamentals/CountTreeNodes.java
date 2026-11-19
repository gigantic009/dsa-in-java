// Count nodes and leaves recursively.
// Time: O(n); recursion space: O(h).
public class CountTreeNodes {
 static class Node{int value;Node left,right;Node(int v){value=v;}}
 static int count(Node n){return n==null?0:1+count(n.left)+count(n.right);}
 static int leaves(Node n){if(n==null)return 0;if(n.left==null&&n.right==null)return 1;return leaves(n.left)+leaves(n.right);}
 public static void main(String[]args){Node r=new Node(1);r.left=new Node(2);r.right=new Node(3);r.left.left=new Node(4);System.out.println("Nodes: "+count(r));System.out.println("Leaves: "+leaves(r));}
}
// Diameter in number of edges, computed in one traversal.
// Time: O(n); recursion space: O(h).
public class TreeDiameter {
 static class Node{int v;Node l,r;Node(int v){this.v=v;}}
 static int diameter;
 static int height(Node n){if(n==null)return 0;int a=height(n.l),b=height(n.r);diameter=Math.max(diameter,a+b);return 1+Math.max(a,b);}
 static int diameter(Node root){diameter=0;height(root);return diameter;}
 public static void main(String[]args){Node r=new Node(1);r.l=new Node(2);r.r=new Node(3);r.l.l=new Node(4);r.l.l.l=new Node(5);System.out.println(diameter(r));}
}
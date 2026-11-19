// Insert a key into a BST; duplicates are ignored.
// Time: O(h); recursive stack: O(h).
public class InsertIntoBST {
 static class Node{int v;Node l,r;Node(int v){this.v=v;}}
 static Node insert(Node n,int x){if(n==null)return new Node(x);if(x<n.v)n.l=insert(n.l,x);else if(x>n.v)n.r=insert(n.r,x);return n;}
 static void inorder(Node n){if(n==null)return;inorder(n.l);System.out.print(n.v+" ");inorder(n.r);}
 public static void main(String[]args){Node r=null;for(int x:new int[]{5,3,7,2,4,6,8})r=insert(r,x);inorder(r);System.out.println();}
}
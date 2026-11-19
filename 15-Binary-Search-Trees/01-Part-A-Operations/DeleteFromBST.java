// Delete a key from a BST (duplicates are ignored during insertion).
// Time: O(h); recursive stack: O(h).
public class DeleteFromBST {
 static class Node{int v;Node l,r;Node(int v){this.v=v;}}
 static Node delete(Node n,int x){if(n==null)return null;if(x<n.v)n.l=delete(n.l,x);else if(x>n.v)n.r=delete(n.r,x);else{if(n.l==null)return n.r;if(n.r==null)return n.l;Node s=n.r;while(s.l!=null)s=s.l;n.v=s.v;n.r=delete(n.r,s.v);}return n;}
 static void inorder(Node n){if(n==null)return;inorder(n.l);System.out.print(n.v+" ");inorder(n.r);}
 public static void main(String[]args){Node r=new Node(5);r.l=new Node(3);r.r=new Node(7);r.l.l=new Node(2);r.l.r=new Node(4);r.r.l=new Node(6);r.r.r=new Node(8);r=delete(r,5);inorder(r);System.out.println();}
}
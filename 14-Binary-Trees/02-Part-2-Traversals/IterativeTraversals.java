// Iterative preorder, inorder and postorder using explicit stacks.
import java.util.ArrayDeque;
public class IterativeTraversals {
 static class Node{int v;Node l,r;Node(int v){this.v=v;}}
 static void preorder(Node root){if(root==null)return;ArrayDeque<Node>s=new ArrayDeque<>();s.push(root);while(!s.isEmpty()){Node n=s.pop();System.out.print(n.v+" ");if(n.r!=null)s.push(n.r);if(n.l!=null)s.push(n.l);}System.out.println();}
 static void inorder(Node root){ArrayDeque<Node>s=new ArrayDeque<>();Node n=root;while(n!=null||!s.isEmpty()){while(n!=null){s.push(n);n=n.l;}n=s.pop();System.out.print(n.v+" ");n=n.r;}System.out.println();}
 static void postorder(Node root){if(root==null)return;ArrayDeque<Node>a=new ArrayDeque<>(),b=new ArrayDeque<>();a.push(root);while(!a.isEmpty()){Node n=a.pop();b.push(n);if(n.l!=null)a.push(n.l);if(n.r!=null)a.push(n.r);}while(!b.isEmpty())System.out.print(b.pop().v+" ");System.out.println();}
 public static void main(String[]args){Node r=new Node(1);r.l=new Node(2);r.r=new Node(3);r.l.l=new Node(4);r.l.r=new Node(5);preorder(r);inorder(r);postorder(r);}
}
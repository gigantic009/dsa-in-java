// Find kth-smallest BST value with inorder traversal.
import java.util.*;
public class KthSmallestBST {
 static class Node{int value;Node left,right;Node(int v){value=v;}}
 public static int kth(Node root,int k){Stack<Node>s=new Stack<>();Node cur=root;
  while(cur!=null||!s.empty()){while(cur!=null){s.push(cur);cur=cur.left;}cur=s.pop();if(--k==0)return cur.value;cur=cur.right;}
  throw new IllegalArgumentException("k out of range");
 }
}
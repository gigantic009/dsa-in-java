// Swap each node's left and right subtrees recursively.
public class InvertBinaryTree {
 static class Node {int value;Node left,right;Node(int v){value=v;}}
 public static Node invert(Node root){
  if(root==null)return null;
  Node temp=root.left;root.left=root.right;root.right=temp; // Mirror this node before its children.
  invert(root.left);invert(root.right);return root;
 }
}
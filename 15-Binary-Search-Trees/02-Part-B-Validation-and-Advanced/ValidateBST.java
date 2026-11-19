// Validate BST ordering using strict lower and upper bounds.
public class ValidateBST {
 static class Node {int value;Node left,right;Node(int v){value=v;}}
 public static boolean valid(Node root){return check(root,Long.MIN_VALUE,Long.MAX_VALUE);}
 private static boolean check(Node n,long low,long high){
  if(n==null)return true;
  if(n.value<=low||n.value>=high)return false; // Node must fit the entire ancestor range.
  return check(n.left,low,n.value)&&check(n.right,n.value,high);
 }
}
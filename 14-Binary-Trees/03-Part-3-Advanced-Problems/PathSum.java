// Check whether a root-to-leaf path sums to target.
public class PathSum {
 static class Node {int value;Node left,right;Node(int v){value=v;}}
 public static boolean exists(Node root,int target){
  if(root==null)return false;
  target-=root.value; // Account for this node's contribution.
  if(root.left==null&&root.right==null)return target==0; // Only leaf paths count.
  return exists(root.left,target)||exists(root.right,target);
 }
}
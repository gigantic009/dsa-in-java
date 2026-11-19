// Breadth-first traversal visits tree nodes level by level.
import java.util.*;
public class LevelOrderTraversal {
 static class Node {int value;Node left,right;Node(int v){value=v;}}
 public static List<List<Integer>> levels(Node root){
  List<List<Integer>> result=new ArrayList<>();if(root==null)return result;
  Queue<Node>q=new ArrayDeque<>();q.add(root);
  while(!q.isEmpty()){
   int size=q.size();List<Integer>level=new ArrayList<>();
   for(int i=0;i<size;i++){Node n=q.remove();level.add(n.value);if(n.left!=null)q.add(n.left);if(n.right!=null)q.add(n.right);}
   result.add(level); // Each iteration completes exactly one depth level.
  }return result;
 }
}
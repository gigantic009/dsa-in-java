// Iterative inorder traversal: left subtree, node, right subtree.
import java.util.*;
public class InorderTraversal {
 static class Node {int value;Node left,right;Node(int v){value=v;}}
 public static List<Integer> traverse(Node root){
  List<Integer> result=new ArrayList<>();Stack<Node>s=new Stack<>();Node current=root;
  while(current!=null||!s.empty()){
   while(current!=null){s.push(current);current=current.left;} // Descend left while saving ancestors.
   current=s.pop();result.add(current.value);current=current.right; // Visit then explore right.
  }return result;
 }
}
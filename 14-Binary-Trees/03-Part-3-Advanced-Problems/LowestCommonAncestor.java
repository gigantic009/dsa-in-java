// Find LCA in a general binary tree (assuming both targets are present).
public class LowestCommonAncestor {
 static class Node{int value;Node left,right;Node(int v){value=v;}}
 public static Node lca(Node root,Node a,Node b){if(root==null||root==a||root==b)return root;Node l=lca(root.left,a,b),r=lca(root.right,a,b);if(l!=null&&r!=null)return root;return l!=null?l:r;}
}
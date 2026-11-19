// Build a height-balanced BST from a sorted array.
// Time: O(n); recursion space: O(log n) for balanced output.
public class SortedArrayToBST {
 static class Node{int v;Node l,r;Node(int v){this.v=v;}}
 static Node build(int[]a,int lo,int hi){if(lo>hi)return null;int m=lo+(hi-lo)/2;Node n=new Node(a[m]);n.l=build(a,lo,m-1);n.r=build(a,m+1,hi);return n;}
 static void inorder(Node n){if(n==null)return;inorder(n.l);System.out.print(n.v+" ");inorder(n.r);}
 public static void main(String[]args){int[]a={1,2,3,4,5,6,7};inorder(build(a,0,a.length-1));System.out.println();}
}
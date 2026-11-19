// Segment tree supporting range minimum queries.
public class RangeMinimumSegmentTree {
 private final int[]tree;private final int n;
 public RangeMinimumSegmentTree(int[]a){n=a.length;tree=new int[Math.max(1,4*n)];if(n>0)build(a,1,0,n-1);}
 private void build(int[]a,int node,int l,int r){if(l==r){tree[node]=a[l];return;}int m=(l+r)/2;build(a,node*2,l,m);build(a,node*2+1,m+1,r);tree[node]=Math.min(tree[node*2],tree[node*2+1]);}
 public int query(int ql,int qr){return query(1,0,n-1,ql,qr);}
 private int query(int node,int l,int r,int ql,int qr){if(ql<=l&&r<=qr)return tree[node];int m=(l+r)/2,result=Integer.MAX_VALUE;if(ql<=m)result=Math.min(result,query(node*2,l,m,ql,qr));if(qr>m)result=Math.min(result,query(node*2+1,m+1,r,ql,qr));return result;}
}
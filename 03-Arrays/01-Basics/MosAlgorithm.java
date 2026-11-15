/*
 * Problem: Given an array and multiple range queries [L, R], answer the sum of each range.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class MosAlgorithm {
    static class Query { int l,r,index,block; Query(int l,int r,int i,int b){this.l=l;this.r=r;index=i;block=b;} }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int q=sc.nextInt(), block=Math.max(1,(int)Math.sqrt(n)); Query[] qs=new Query[q];
        for(int i=0;i<q;i++){int l=sc.nextInt(),r=sc.nextInt();qs[i]=new Query(l,r,i,l/block);}
        Arrays.sort(qs,(x,y)->x.block!=y.block?Integer.compare(x.block,y.block):(x.block%2==0?Integer.compare(x.r,y.r):Integer.compare(y.r,x.r)));
        long[] ans=new long[q]; int left=0,right=-1; long sum=0;
        for(Query qu:qs){while(left>qu.l)sum+=a[--left];while(right<qu.r)sum+=a[++right];while(left<qu.l)sum-=a[left++];while(right>qu.r)sum-=a[right--];ans[qu.index]=sum;}
        for(long x:ans)System.out.println(x);
    }
}
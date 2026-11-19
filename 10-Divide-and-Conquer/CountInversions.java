// Count inversions while merging halves in sorted order.
public class CountInversions {
 public static long count(int[]a){return sort(a,0,a.length-1);}
 private static long sort(int[]a,int l,int r){if(l>=r)return 0;int m=l+(r-l)/2;long total=sort(a,l,m)+sort(a,m+1,r);int[]tmp=new int[r-l+1];int i=l,j=m+1,k=0;while(i<=m&&j<=r){if(a[i]<=a[j])tmp[k++]=a[i++];else{total+=m-i+1;tmp[k++]=a[j++];}}while(i<=m)tmp[k++]=a[i++];while(j<=r)tmp[k++]=a[j++];for(int x=0;x<tmp.length;x++)a[l+x]=tmp[x];return total;}
}
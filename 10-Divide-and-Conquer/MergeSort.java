// Merge sort divides the array and merges sorted halves.
import java.util.*;
public class MergeSort {
 public static void sort(int[]a){if(a.length<2)return;int m=a.length/2;int[]l=Arrays.copyOfRange(a,0,m),r=Arrays.copyOfRange(a,m,a.length);sort(l);sort(r);merge(a,l,r);}
 private static void merge(int[]a,int[]l,int[]r){int i=0,j=0,k=0;while(i<l.length&&j<r.length)a[k++]=l[i]<=r[j]?l[i++]:r[j++];while(i<l.length)a[k++]=l[i++];while(j<r.length)a[k++]=r[j++];}
}
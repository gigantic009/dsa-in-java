/*
 * Problem: Find the union and intersection of two sorted arrays, without repeating output values.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class UnionIntersectionSortedArrays {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int m=sc.nextInt();int[] b=new int[m];for(int i=0;i<m;i++)b[i]=sc.nextInt();int i=0,j=0;List<Integer> u=new ArrayList<>(),in=new ArrayList<>();while(i<n||j<m){int v;if(j==m||(i<n&&a[i]<b[j]))v=a[i++];else if(i==n||b[j]<a[i])v=b[j++];else{v=a[i];i++;j++;if(in.isEmpty()||in.get(in.size()-1)!=v)in.add(v);}if(u.isEmpty()||u.get(u.size()-1)!=v)u.add(v);}System.out.println("Union: "+u);System.out.println("Intersection: "+in);}
}
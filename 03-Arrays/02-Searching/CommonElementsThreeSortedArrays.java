/*
 * Problem: Print the common elements present in three sorted arrays.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class CommonElementsThreeSortedArrays {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int m=s.nextInt();int[] b=new int[m];for(int i=0;i<m;i++)b[i]=s.nextInt();int k=s.nextInt();int[] c=new int[k];for(int i=0;i<k;i++)c[i]=s.nextInt();int i=0,j=0,h=0;List<Integer> out=new ArrayList<>();while(i<n&&j<m&&h<k){if(a[i]==b[j]&&b[j]==c[h]){if(out.isEmpty()||out.get(out.size()-1)!=a[i])out.add(a[i]);i++;j++;h++;}else{int v=Math.min(a[i],Math.min(b[j],c[h]));while(i<n&&a[i]==v)i++;while(j<m&&b[j]==v)j++;while(h<k&&c[h]==v)h++;}}System.out.println(out);}
}
/*
Selection sort selects the minimum remaining value for each position.
Example [4,2,5,1] -> [1,2,4,5]. Time O(n^2), space O(1).
*/
import java.util.Arrays;
public class SelectionSort {static void sort(int[]a){for(int i=0;i<a.length;i++){int m=i;for(int j=i+1;j<a.length;j++)if(a[j]<a[m])m=j;int t=a[i];a[i]=a[m];a[m]=t;}}public static void main(String[]x){int[]a={4,2,5,1};sort(a);System.out.println(Arrays.toString(a));}}
/*
Bubble sort repeatedly swaps adjacent out-of-order elements.
Example [5,1,4,2] -> [1,2,4,5]. Time O(n^2), best O(n) with early exit; space O(1).
*/
import java.util.Arrays;
public class BubbleSort {static void sort(int[]a){for(int i=0;i<a.length;i++){boolean changed=false;for(int j=0;j<a.length-1-i;j++)if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;changed=true;}if(!changed)break;}}public static void main(String[]x){int[]a={5,1,4,2};sort(a);System.out.println(Arrays.toString(a));}}
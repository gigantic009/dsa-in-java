// Recursion builds permutations by swapping each candidate into position i.
import java.util.*;
public class PermutationsRecursion {
 public static List<List<Integer>>generate(int[]a){List<List<Integer>>out=new ArrayList<>();permute(a,0,out);return out;}
 private static void permute(int[]a,int i,List<List<Integer>>out){if(i==a.length){List<Integer>list=new ArrayList<>();for(int x:a)list.add(x);out.add(list);return;}for(int j=i;j<a.length;j++){int t=a[i];a[i]=a[j];a[j]=t;permute(a,i+1,out);t=a[i];a[i]=a[j];a[j]=t; // Restore array to explore another choice.
 }}
}
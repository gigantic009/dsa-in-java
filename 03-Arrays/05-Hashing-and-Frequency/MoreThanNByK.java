/*
 * Problem: Print all array elements that occur more than n/k times.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class MoreThanNByK {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt(),k=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();if(k<=0){System.out.println("k must be positive");return;}Map<Integer,Integer> f=new HashMap<>();for(int x:a)f.merge(x,1,Integer::sum);List<Integer> out=new ArrayList<>();for(var e:f.entrySet())if(e.getValue()>n/k)out.add(e.getKey());Collections.sort(out);System.out.println(out);}
}
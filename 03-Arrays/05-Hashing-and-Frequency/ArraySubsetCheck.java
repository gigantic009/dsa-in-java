/*
 * Problem: Determine whether every element of the second array occurs in the first array, respecting frequency.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class ArraySubsetCheck {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();Map<Integer,Integer> f=new HashMap<>();for(int i=0;i<n;i++)f.merge(sc.nextInt(),1,Integer::sum);int m=sc.nextInt();boolean ok=true;for(int i=0;i<m;i++){int x=sc.nextInt();int c=f.getOrDefault(x,0);if(c==0)ok=false;else f.put(x,c-1);}System.out.println(ok?"Yes":"No");}
}
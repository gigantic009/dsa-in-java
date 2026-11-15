/*
 * Problem: Compute the factorial of a non-negative integer whose result may exceed primitive numeric types.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
import java.math.BigInteger;
public class FactorialLargeNumber {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();if(n<0){System.out.println("Input must be non-negative");return;}BigInteger ans=BigInteger.ONE;for(int i=2;i<=n;i++)ans=ans.multiply(BigInteger.valueOf(i));System.out.println(ans);}
}
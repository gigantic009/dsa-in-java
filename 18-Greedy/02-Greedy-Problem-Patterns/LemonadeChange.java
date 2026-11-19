// Greedy change-making for $5, $10, $20 bills when lemonade costs $5.
// Time O(n); space O(1).
public class LemonadeChange {
 static boolean canChange(int[]b){int five=0,ten=0;for(int x:b){if(x==5)five++;else if(x==10){if(five==0)return false;five--;ten++;}else if(x==20){if(ten>0&&five>0){ten--;five--;}else if(five>=3)five-=3;else return false;}else return false;}return true;}
 public static void main(String[]args){System.out.println(canChange(new int[]{5,5,5,10,20}));}
}
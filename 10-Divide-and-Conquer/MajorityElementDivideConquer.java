// Majority element candidate via divide-and-conquer.
public class MajorityElementDivideConquer {
    private static int candidate(int[] a,int l,int r) {
        if(l==r) return a[l];
        int m=l+(r-l)/2;
        int x=candidate(a,l,m), y=candidate(a,m+1,r);
        if(x==y) return x;
        int cx=0,cy=0;
        for(int i=l;i<=r;i++){ if(a[i]==x)cx++; if(a[i]==y)cy++; }
        return cx>cy?x:y; // Compare candidates across the combined interval.
    }
    public static int majority(int[] a){return candidate(a,0,a.length-1);}
    public static void main(String[] args){System.out.println(majority(new int[]{2,2,1,2,3,2,2}));}
}
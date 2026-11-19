// Determine whether a positive integer is a power of two.
public class PowerOfTwo {
    public static boolean check(int n) {
        return n > 0 && (n & (n - 1)) == 0; // Powers of two contain exactly one set bit.
    }
    public static void main(String[] args) { System.out.println(check(16)); }
}
public class FastPower {
    public static long power(long x, int n) {
        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}

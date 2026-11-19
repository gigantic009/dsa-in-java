import java.util.Scanner;

public class FastPower {
    public static long power(long x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }

        // Any number raised to the power 0 is 1.
        if (n == 0) {
            return 1;
        }

        // Compute x^(n/2) once, then reuse it to reduce recursive calls.
        // long arithmetic may overflow for large powers; Java does not detect it.
        long half = power(x, n / 2);

        // Square the half-power; multiply by x once more for odd exponents.
        return n % 2 == 0 ? half * half : x * half * half;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        long x = sc.nextLong();

        System.out.print("Non-negative exponent: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Exponent must be non-negative");
            sc.close();
            return;
        }

        System.out.println(power(x, n));
        sc.close();
    }
}

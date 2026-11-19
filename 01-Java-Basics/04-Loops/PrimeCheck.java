import java.util.Scanner;

/**
 * Determines whether n is prime using trial division up to sqrt(n).
 *
 * Values below 2 are not prime. A composite number must have a divisor
 * no greater than its square root; n / i avoids i * i overflow.
 *
 * Time complexity: O(sqrt(n)) for n >= 2.
 * Auxiliary space: O(1).
 */
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean prime = n >= 2;

        // If n has a factor larger than sqrt(n), its paired factor is smaller.
        for (int i = 2; i <= n / i && prime; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
        sc.close();
    }
}

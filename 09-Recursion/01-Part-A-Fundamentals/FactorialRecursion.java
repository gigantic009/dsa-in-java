import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20 for long factorial");
        }

        // Base case: 0! and 1! are both 1.
        if (n <= 1) {
            return 1;
        }

        // Reduce the problem to factorial of the previous number.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int n = sc.nextInt();

        // A long can safely store factorials only up to 20!.
        if (n < 0 || n > 20) {
            System.out.println("Enter n from 0 to 20 for long factorial");
            sc.close();
            return;
        }

        System.out.println(factorial(n));
        sc.close();
    }
}

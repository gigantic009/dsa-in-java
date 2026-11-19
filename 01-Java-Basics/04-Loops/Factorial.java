import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else if (n > 20) {
            System.out.println("Result is too large for long");
        } else {
            long result = 1;

            for (int i = 2; i <= n; i++) {
                result *= i;
            }

            System.out.println(result);
        }

        sc.close();
    }
}

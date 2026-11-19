import java.util.Scanner;

/** Checks whether a positive integer is a power of two. */
public class PowerOfTwo {

    // A power of two has one set bit; n & (n - 1) removes that bit.
    public static boolean check(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println(number + " is a power of two: " + check(number));
        sc.close();
    }
}
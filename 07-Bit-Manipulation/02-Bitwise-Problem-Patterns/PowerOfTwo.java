import java.util.Scanner;

public class PowerOfTwo {
    // Positive powers of two have exactly one set bit in binary.
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

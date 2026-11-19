import java.util.Scanner;

public class BinaryStrings {
    public static void generate(int n, int last, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        // Always add 0, because it cannot create consecutive 1s.
        generate(n - 1, 0, ans + "0");

        // Add 1 only when the previous digit was not 1.
        if (last == 0) {
            generate(n - 1, 1, ans + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Length must not be negative");
            sc.close();
            return;
        }

        generate(n, 0, "");
        sc.close();
    }
}

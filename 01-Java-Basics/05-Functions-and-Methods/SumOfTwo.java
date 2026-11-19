import java.util.Scanner;

public class SumOfTwo {
    public static int sum(int a, int b) { return a + b; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}

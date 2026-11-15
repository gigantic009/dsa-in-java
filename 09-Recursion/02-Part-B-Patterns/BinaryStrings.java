public class BinaryStrings {
    public static void generate(int n, int lastPlace, String answer) {
        if (n == 0) {
            System.out.println(answer);
            return;
        }

        generate(n - 1, 0, answer + "0");

        if (lastPlace == 0) {
            generate(n - 1, 1, answer + "1");
        }
    }

    public static void main(String[] args) {
        generate(3, 0, "");
    }
}

// Reverse a string recursively by reversing its suffix and moving the first character.
// Time: O(n^2) because substring and concatenation copy characters repeatedly.
// Stack depth: O(n); total intermediate string allocation is O(n^2).
public class RecursiveStringReverse {
    public static String reverse(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String must not be null");
        }

        if (s.length() <= 1) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "recursion";
        System.out.println(input + " -> " + reverse(input));
    }
}

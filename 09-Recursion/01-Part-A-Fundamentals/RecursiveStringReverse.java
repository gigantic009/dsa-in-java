// Reverse a string recursively by reversing its suffix and moving the first character.
// Time and auxiliary space: O(n), excluding the returned string allocations.
public class RecursiveStringReverse {
    public static String reverse(String s) {
        if (s == null) throw new IllegalArgumentException("String must not be null");
        if (s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String input = "recursion";
        System.out.println(input + " -> " + reverse(input));
    }
}
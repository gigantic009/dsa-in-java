// Check whether the ith bit (0-based) is set.
public class CheckBit {
    public static boolean isSet(int number, int bit) {
        return (number & (1 << bit)) != 0; // Mask isolates the requested bit.
    }
    public static void main(String[] args) {
        System.out.println(isSet(10, 1)); // 10 is binary 1010; bit 1 is set.
    }
}
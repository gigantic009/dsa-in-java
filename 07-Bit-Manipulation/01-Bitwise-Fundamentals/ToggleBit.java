// Toggle a bit: set bits become zero and zero bits become one.
public class ToggleBit {
    public static int toggle(int number, int bit) {
        return number ^ (1 << bit); // XOR changes only the selected bit.
    }
    public static void main(String[] args) { System.out.println(toggle(10, 1)); }
}
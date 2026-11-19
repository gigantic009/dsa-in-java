// Clear (turn off) a selected bit.
public class ClearBit {
    public static int clear(int number, int bit) {
        return number & ~(1 << bit); // NOT mask has zero at target bit; AND clears it.
    }
    public static void main(String[] args) { System.out.println(clear(10, 1)); }
}
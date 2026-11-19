// Set a selected bit without changing the other bits.
public class SetBit {
    public static int set(int number, int bit) {
        return number | (1 << bit); // OR turns the masked bit on.
    }
    public static void main(String[] args) { System.out.println(set(8, 1)); }
}
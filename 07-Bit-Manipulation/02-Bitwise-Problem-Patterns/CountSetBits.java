// Count the number of 1 bits using Brian Kernighan's algorithm.
public class CountSetBits {
    public static int count(int number) {
        int total = 0;
        while (number != 0) {
            number &= (number - 1); // Removes the rightmost set bit each iteration.
            total++;
        }
        return total;
    }
    public static void main(String[] args) { System.out.println(count(13)); }
}
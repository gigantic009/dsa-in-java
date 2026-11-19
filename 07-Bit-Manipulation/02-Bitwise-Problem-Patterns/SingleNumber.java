// Find the value occurring once when every other value occurs twice.
public class SingleNumber {
    public static int find(int[] nums) {
        int answer = 0;
        for (int value : nums) answer ^= value; // Paired values cancel; the unique value remains.
        return answer;
    }
    public static void main(String[] args) { System.out.println(find(new int[]{4,1,2,1,2})); }
}
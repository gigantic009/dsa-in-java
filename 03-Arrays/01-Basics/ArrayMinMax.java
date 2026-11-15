public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 8};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

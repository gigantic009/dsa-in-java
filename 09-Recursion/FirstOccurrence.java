public class FirstOccurrence {
    public static int find(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return find(arr, key, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9};
        System.out.println(find(arr, 2, 0));
    }
}

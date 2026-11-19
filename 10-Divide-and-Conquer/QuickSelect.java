// Quickselect finds the kth largest element without fully sorting.
public class QuickSelect {
    public static int kthLargest(int[] nums, int k) {
        int target = nums.length - k; // Convert kth-largest to ascending target index.
        return select(nums, 0, nums.length - 1, target);
    }
    private static int select(int[] a, int left, int right, int target) {
        int pivot = a[right], store = left;
        for (int i = left; i < right; i++) {
            if (a[i] < pivot) { int t=a[i]; a[i]=a[store]; a[store]=t; store++; }
        }
        int t=a[store]; a[store]=a[right]; a[right]=t; // Pivot reaches its final sorted position.
        if (store == target) return a[store];
        if (store > target) return select(a,left,store-1,target);
        return select(a,store+1,right,target);
    }
    public static void main(String[] args) { System.out.println(kthLargest(new int[]{3,2,1,5,6,4},2)); }
}
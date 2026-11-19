/** Quick sort using partition. Average O(n log n), worst O(n^2). */
import java.util.Arrays;
public class QuickSort {
    static void sort(int[] nums,int low,int high) {
        if(low>=high) return;
        int pivotIndex=partition(nums,low,high);
        sort(nums,low,pivotIndex-1);
        sort(nums,pivotIndex+1,high);
    }
    private static int partition(int[] nums,int low,int high) {
        int pivot=nums[high],index=low;
        for(int j=low;j<high;j++) {
            if(nums[j]<=pivot) swap(nums,index++,j);
        }
        swap(nums,index,high);
        return index;
    }
    private static void swap(int[] nums,int i,int j) {
        int temp=nums[i]; nums[i]=nums[j]; nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums={9,3,7,1,5};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
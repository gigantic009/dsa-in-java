/** LeetCode 74: search sorted matrix via flattened binary search. O(log(mn)). */
public class SearchMatrix {
    static boolean searchMatrix(int[][] matrix,int target) {
        int rows=matrix.length,cols=matrix[0].length;
        int low=0,high=rows*cols-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            int value=matrix[mid/cols][mid%cols];
            if(value==target) return true;
            if(value<target) low=mid+1; else high=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,3,5},{7,9,11}};
        System.out.println(searchMatrix(matrix,9));
    }
}
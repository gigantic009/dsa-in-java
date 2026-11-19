/** LeetCode 74: binary search treating matrix as a sorted 1D array. O(log(mn)). */
public class SearchMatrix {
    static boolean searchMatrix(int[][] matrix,int target) {
        int rows=matrix.length, cols=matrix[0].length;
        int low=0, high=rows*cols-1; // Virtual flattened array index range.
        while(low<=high) {
            int mid=low+(high-low)/2;
            // Convert virtual index back to row and column.
            int value=matrix[mid/cols][mid%cols];
            if(value==target) return true;
            if(value<target) low=mid+1; // Target lies after this position.
            else high=mid-1;            // Target lies before this position.
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,3,5},{7,9,11}};
        System.out.println(searchMatrix(matrix,9));
    }
}
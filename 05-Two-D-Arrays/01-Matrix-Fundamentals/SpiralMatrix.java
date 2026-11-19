/** LeetCode 54: spiral traversal of a matrix. O(rows*columns). */
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    static List<Integer> spiral(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while(top<=bottom&&left<=right) {
            for(int col=left;col<=right;col++) result.add(matrix[top][col]);
            top++;
            for(int row=top;row<=bottom;row++) result.add(matrix[row][right]);
            right--;
            if(top<=bottom) {
                for(int col=right;col>=left;col--) result.add(matrix[bottom][col]);
                bottom--;
            }
            if(left<=right) {
                for(int row=bottom;row>=top;row--) result.add(matrix[row][left]);
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(matrix));
    }
}
/** LeetCode 73: use first row/column as markers. O(mn), O(1) extra. */
import java.util.Arrays;
public class SetMatrixZeroes {
    static void setZeroes(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        boolean firstRow=false,firstCol=false;
        for(int row=0;row<rows;row++) if(matrix[row][0]==0) firstCol=true;
        for(int col=0;col<cols;col++) if(matrix[0][col]==0) firstRow=true;
        for(int row=1;row<rows;row++)
            for(int col=1;col<cols;col++)
                if(matrix[row][col]==0){matrix[row][0]=0;matrix[0][col]=0;}
        for(int row=1;row<rows;row++)
            if(matrix[row][0]==0)
                for(int col=1;col<cols;col++) matrix[row][col]=0;
        for(int col=1;col<cols;col++)
            if(matrix[0][col]==0)
                for(int row=1;row<rows;row++) matrix[row][col]=0;
        if(firstRow) for(int col=0;col<cols;col++) matrix[0][col]=0;
        if(firstCol) for(int row=0;row<rows;row++) matrix[row][0]=0;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix); System.out.println(Arrays.deepToString(matrix));
    }
}
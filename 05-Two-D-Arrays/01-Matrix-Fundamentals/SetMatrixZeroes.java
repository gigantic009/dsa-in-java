/** LeetCode 73: mark affected rows/columns in first row and column. O(mn), O(1). */
import java.util.Arrays;
public class SetMatrixZeroes {
    static void setZeroes(int[][] matrix) {
        int rows=matrix.length, cols=matrix[0].length;
        boolean firstRow=false, firstCol=false; // Preserve zeroes in first row/column.
        for(int row=0;row<rows;row++) if(matrix[row][0]==0) firstCol=true;
        for(int col=0;col<cols;col++) if(matrix[0][col]==0) firstRow=true;
        // Mark zero locations using the first cell of each row/column.
        for(int row=1;row<rows;row++)
            for(int col=1;col<cols;col++)
                if(matrix[row][col]==0){matrix[row][0]=0;matrix[0][col]=0;}
        // Clear rows marked by their first cell.
        for(int row=1;row<rows;row++)
            if(matrix[row][0]==0)
                for(int col=1;col<cols;col++) matrix[row][col]=0;
        // Clear columns marked by their first-row cell.
        for(int col=1;col<cols;col++)
            if(matrix[0][col]==0)
                for(int row=1;row<rows;row++) matrix[row][col]=0;
        // Clear first row/column last, using saved flags.
        if(firstRow) for(int col=0;col<cols;col++) matrix[0][col]=0;
        if(firstCol) for(int row=0;row<rows;row++) matrix[row][0]=0;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix); System.out.println(Arrays.deepToString(matrix));
    }
}